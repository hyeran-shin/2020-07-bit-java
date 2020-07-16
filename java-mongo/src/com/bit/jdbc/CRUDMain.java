package com.bit.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;

public class CRUDMain {
	static Block<Document> prnBlock = new Block<Document>() {
		@Override
		public void apply(final Document document) {
			System.out.println(document.toJson());
		}
	};
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		MongoClient mClient = new MongoClient("localhost",27017);
		MongoDatabase testDB = mClient.getDatabase("test");
		MongoCollection<Document> collection = testDB.getCollection("employees");
		
		// 1. Create (insert)
		Document document = new Document("empno", "1001")
						.append("ename","tname")
						.append("job", "tjob")
						.append("hiredate", "09-04-2020")
						.append("sal", 1300)
						.append("deptno", 50);
//		System.out.println(document.toJson());
//		collection.insertOne(document); 
		// 문서 하나를 삽입
//		collection.find().forEach(prnBlock);
		
		Document document2 = new Document("empno", "1002")
				.append("ename","tname_2")
				.append("job", "tjob_2")
				.append("hiredate", "09-04-2020")
				.append("sal", 2700)
				.append("deptno", 60);
		
		Document document3 = new Document("empno", "1003")
				.append("ename","tname_3")
				.append("job", "tjob_3")
				.append("hiredate", "09-04-2020")
				.append("sal", 1900)
				.append("deptno", 60);
		
		List<Document> docList = new ArrayList<Document>();
		docList.add(document2);
		docList.add(document3);
		
//		collection.insertMany(docList); 
		// 여러 문서를 삽입
		// -> 리스트로 담아 insertMany() 메소드 활용
		
//		collection.find().forEach(prnBlock);
		
		// 2. Update
		collection.updateOne( // 데이터 하나 수정
				Filters.eq("empno","1001"), // 조건
				Updates.combine(
							Updates.set("ename", "update_name"), // 수정할 내용
							Updates.currentDate("update_field")  // 수정한 시간
								),
				new UpdateOptions().upsert(true).bypassDocumentValidation(true)
				// 조건이 맞지 않으면 upsert 수행
				// update + insert 합쳐놓은것, 조건이 맞지 않으면 insert, 필드 삽입해라.
				// byPassDocumentValidation : 제약 조건 유지
				);
//		collection.find().forEach(prnBlock);
		// toJson으로 했을 때 콘솔로 헷갈릴 수 있어서 Json으로 안함
		// db에는 같은 값 들어가있음.
//		collection.find().forEach(new Block<Document>() {
//					@Override
//					public void apply(Document arg) {
//						System.out.println(arg);
//					}
//		});
		
		
		// 조건에 맞는 여러 field 수정
		collection.updateMany(
					Filters.eq("hiredate","09-04-2020"),
					Updates.combine(
							Updates.set("sal", 0),
							Updates.currentDate("lastModigyField")
									)
				);
//		collection.find().forEach(prnBlock);
		
		// update 	: field 단위 수정
		// save 	: document 단위 수정
		//	-> replaceOne(...)
//		collection.replaceOne(
//						Filters.eq("ename","tname_2"),
//						new Document("empno","1004").append("sal", 1500).append("deptno", 60)
//				);
//		collection.find().forEach(prnBlock);
		
		
		// 3. Delete
//		collection.deleteOne(Filters.eq("empno","1003"));
		// 조건에 맞는 것을 하나만 삭제
//		collection.find().forEach(prnBlock);
		
		collection.deleteMany(Filters.eq("empno","1004"));
		collection.find().forEach(prnBlock);
		mClient.close();
		
		
		// Q. SQL Board(myboard-jdbc Project) -> MongoDB Board 변환하세요
	}
}
