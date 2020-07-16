package com.bit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.bit.util.JDBCClose;

public class UpdateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 연결 객체 얻기
			String url = "jdbc:mysql://localhost:3306/hellodb?serverTimezone=UTC";
			String user = "root";
			String pw = "root";
			con = DriverManager.getConnection(url,user,pw);
			
			// 3. sql 생성 및 수행
			StringBuilder sql = new StringBuilder();
			sql.append(" UPDATE t_board "); 
			sql.append(" SET title = ?");
			sql.append(" WHERE no = ?");
			
			Scanner s = new Scanner(System.in);
			System.out.println("수정할 글 번호 입력 : ");
			int no =Integer.parseInt(s.nextLine());
			System.out.println("수정할 제목 입력 : ");
			String title = s.nextLine();
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1,title);
			pstmt.setInt(2, no);
			
			int uCnt = pstmt.executeUpdate();
			System.out.println("총 " + uCnt + "개의 행이 추가되었습니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(con, pstmt);
		}
	}

}
