package com.bit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.bit.util.JDBCClose;

public class DeleteMain {
	public static void main(String[] args) {
		// 글 번호 삭제
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hellodb?serverTimezone=UTC";
			String user = "root";
			String pw = "root";
			con = DriverManager.getConnection(url, user,pw);
			
			StringBuilder sql = new StringBuilder();
			sql.append(" DELETE FROM t_board ");
			sql.append(" WHERE no = ? ");
			// 앞뒤로 공백을 주어 쿼리가 붙는 경우를 방지
			Scanner s = new Scanner(System.in);
			System.out.println("삭제할 글 번호 입력");
			int no = Integer.parseInt(s.nextLine());
						
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1,no);
			
			int dCnt = pstmt.executeUpdate();
			System.out.println("총 " + dCnt + "개의 행이 삭제되었습니다.");
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(con, pstmt);
		}
	}
}
