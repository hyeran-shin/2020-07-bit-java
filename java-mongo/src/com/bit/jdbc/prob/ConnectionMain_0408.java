package com.bit.jdbc.prob;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class ConnectionMain_0408 {
	static Block<Document> prnBlock = new Block<Document>() {
		@Override
		public void apply(final Document document) {
			System.out.println(document.toJson());
		}
	};
	
	public static void main(String[] args) {
		// 연결
		MongoClient mClient = new MongoClient("localhost", 27017);
		// DB 가져오기
		MongoDatabase testDB = mClient.getDatabase("test");
		// 컬렉션 가져오기
		MongoCollection<Document> collection = testDB.getCollection("employees");

		//Q1.
		Document doc = new Document("job","CLERK").append("sal", new Document("$gte",1000));
//		collection.find(doc).forEach(prnBlock);
		
		//Q2.
		doc.clear();
		doc = new Document("job","SALESMAN").append("deptno", 30);
//		collection.find(doc).forEach(prnBlock);
		
		//Q3.
		doc.clear();
		doc = new Document("sal", new Document("$lte",1000));
//		collection.find(doc).projection(new Document("empno",1).append("ename", 1).append("sal", 1)).forEach(prnBlock);
		
		//Q4.
		doc.clear();
		doc = new Document("sal", new Document("$gte",1500).append("$lte", 5000));
//		collection.find(doc).projection(new Document("empno",1).append("ename", 1).append("sal", 1)).forEach(prnBlock);
		
		//Q5.
		doc.clear();
		doc =  new Document("$or",Arrays.asList(new Document("deptno",10), new Document("deptno", 30)));
//		collection.find(doc).forEach(prnBlock);
//		collection.find(Filters.or(Filters.eq("deptno",10),Filters.eq("deptno",30))).forEach(prnBlock);	
		
		//Q6.
		doc.clear();
		doc = new Document("$and",
				Arrays.asList(new Document("$or", Arrays.asList(new Document("deptno",10),new Document("deptno",30)))
						, new Document("sal",new Document("$gte", 1500))));
//		collection.find(doc).forEach(prnBlock);
				
		//Q7.
		doc.clear();
		doc = new Document("job", new Document("$ne", "SALESMAN"));
//		collection.find(doc).sort(new Document("empno",1)).forEach(prnBlock);	

		//Q8.
		doc.clear();
		collection.find(Filters.and(
				Filters.or(Filters.eq("job","SALESMAN") , Filters.eq("job","CLERK")),
				Filters.gte("sal", 1000),
				Filters.lte("sal", 3500)
				)).projection(new Document("empno",1).append("ename",1).append("sal",1).append("job",1)
				).forEach(prnBlock);
				
	}

}






