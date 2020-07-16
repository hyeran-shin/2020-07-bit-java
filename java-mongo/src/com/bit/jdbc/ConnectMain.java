package com.bit.jdbc;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class ConnectMain {
//	 ststic b<a> pr = new b<a>() {ap(d) d.print}
	//.foreach(pr)
	static Block<Document> prnBlock = new Block<Document>() {
				@Override
				public void apply(final Document document) {
					System.out.println(document.toJson()); //Document는 BSON 형태 (2진) 
				}
	};
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// 1. 연결 (MongoDB 기본 포트 : 27017)
		MongoClient mClient = new MongoClient("localhost",27017);
		System.out.println("연결 확인");
		
		// 2. DB 가져오기
		MongoDatabase testDB = mClient.getDatabase("test");
		
		// 3. 컬렉션 가져오기
		MongoCollection<Document> collection = testDB.getCollection("zipcode");
		
		// 4. 컬렉션 내부의 데이터 찾기
//		collection.find().forEach(prnBlock);
		
		
//		Filters.eq("city","NEW YORK"); // 조건문
		// "city" 가 "NEW YORK"인 것을 찾기 위한 조건절
		
		// 1개 조건
//		collection.find(Filters.eq("city","NEW YORK")).forEach(prnBlock);
		
		// 2개 이상의 조건
//		collection.find( Filters.and(Filters.eq("city","NEW YORK") , 
//									 Filters.gte("pop", 3000) , 
//									 Filters.gt("_id", "10050")
//									 )  
//						).forEach(prnBlock);	
		
	
		// Document 클래스 활용
		// -> 문서 객체를 활용하여 Filters가 아닌 보다 편한 방법
		// -> * 해당 문서의 데이터와 일치
		// -> "key"-"value" 형식(JSON)
		// -> new Document(...)라는 문법이 Query에서의 { }와 같이 생각
//		Document doc = new Document("city", "NEW YORK");
//		collection.find(doc).sort(new Document("_id",1)).forEach(prnBlock);
//		
//		doc = new Document("state", "NY");
//		collection.find(doc).sort(new Document("_id",1)).forEach(prnBlock);
//		
		// 문서 객체에 조건절 전달
		//  -> {pop : {$gte : 10000}}
		Document doc3 = new Document("pop" , new Document("$gte" , 100000));
//		collection.find(doc3).forEach(prnBlock);
		
		
		// MongoCursor (MySQL의 ResultSet처럼 활용) 
		//  -> iterator(반복자)를 반환 받아 순회
		MongoCursor<Document> cursor = collection.find(doc3).iterator();
		while(cursor.hasNext()) {
			Document cur_doc = cursor.next();
			System.out.println(cur_doc.get("city") +" : " +  cur_doc.get("_id"));
		}
		
//		Document doc4 = new Document("state", "MA");
		// find({}, {city:1, loc : 1} )
//		collection.find(doc4).projection(new Document("city",1).append("loc", 1)).forEach(prnBlock);
		
		
//		collection.find(doc4).sort(new Document("_id",1)).limit(10).forEach(prnBlock);
//		collection.find(doc4).sort(new Document("_id",-1)).limit(10).forEach(prnBlock);
		
		
		
		
		
		mClient.close();
		
	}
}






