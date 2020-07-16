package com.bit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

// JDBC 연결 테스트
public class ConnectMain {
	public static void main(String[] args) {
		try {
			// 드라이버 클래스 로딩
//			Class.forName("com.mysql.jdbc.Driver"); // 버전 문제
			// 다른 드라이버 클래스 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hellodb?serverTimezone=UTC";
			String user = "root";
			String pw = "root";
			
			@SuppressWarnings("unused")
			Connection con = DriverManager.getConnection(url,user,pw);
			
			System.out.println("연결 성공");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
