package com.bit.jdbc;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;

public class AggregateMain {
	// Block 인터페이스 : 검색된 하나의 결과물 -> Document
	// Document를 전달 받아서 결과물을 FindIterable 인터페이스를 출력하는 역할
	static Block<Document> prnBlock = new Block<Document>() {
		@Override
		public void apply(final Document arg) {
			System.out.println(arg.toJson());
		}
	};
	public static void main(String[] args) {
		MongoClient mClient = new MongoClient("localhost",27017);
		MongoDatabase testDB = mClient.getDatabase("test");
		
		// zipcode Collection
		MongoCollection<Document> collection = testDB.getCollection("zipcode");
		
		collection.aggregate(
				Arrays.asList(
						Aggregates.match(Filters.eq("state","NY")),
						new Document("$project", 
								new Document("_id",0)
								.append("state",1)
								.append("city", 1)
								)
						)
				).forEach(prnBlock);;
				
		// employees Collection 가져오기
		collection = testDB.getCollection("employees");
		collection.aggregate(
				Arrays.asList(
						Aggregates.match(Filters.eq("deptno",20)),
						Aggregates.group(
								"$deptno",
								Accumulators.sum("total_sal", "$sal")
								)
						)
				).forEach(prnBlock);;		

				
				
		// exclude(..) : 제외할 필드 { _id : 0}
		// excludeId() : _id 제외
		// include(..) : 포함할 필드 { ename : 1, deptno :1 }
		// 추천
		collection.aggregate(
				Arrays.asList(
						Aggregates.project(
								Projections.fields(
										Projections.excludeId(),
										Projections.include("ename","deptno")
										)
								)
						)
				).forEach(prnBlock);
	
		mClient.close();
	}
}










