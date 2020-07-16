package com.bit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bit.util.JDBCClose;

public class SelectMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// 1단계 : 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩...");
			
			// 2단계 : 연결 객체 얻기
			String url = "jdbc:mysql://localhost:3306/hellodb?serverTimezone=UTC";
			String user = "root";
			String pw = "root";
			
			con = DriverManager.getConnection(url,user,pw);
			
			// 3단계 : SQL 생성 및 수행
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT no, title, writer, reg_date as date");
			sql.append(" FROM t_board ");
			
			pstmt = con.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			// ResultSet (결과 집합) : 조회된 결과를 받기 위한 객체
			// - executeQuery의 결과를 기억하기 위한 클래스
			// - next() 메소드를 활용하여 값을 추출 
			// - 만약 데이터가 없다면 false를 반환
			
			while(rs.next()) {// 받아온 결과의 다음 행이 존재한다면 돌아라.
				// *조회된 결과의 컬럼명으로 받아라 
				//	-> ALIAS 이름으로 받아라
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
//				String regDate = rs.getString("reg_date");
				String regDate = rs.getString("date"); // as 로 select 했을 때, 컬럼 가져옴
				
				
				System.out.println("-------------------");
				System.out.println("글번호 : " + no);
				System.out.println("글제목 : " + title);
				System.out.println("작성자 : " + writer);
				System.out.println("등록일 : " + regDate);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(con, pstmt);
		}
	}
}





