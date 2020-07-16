package com.bit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.bit.util.JDBCClose;

/* 
 * [테이블 생성]
 * CREATE TABLE t_board(
 * no int not null auto_increment,
 * title varchar(20),
 * writer varchar(10),
 * reg_date timestamp not null default now(),
 * privary key(no)
 * );
*/

public class InsertMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		// 1단계 : 드라이버 로딩
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩");

			// 2단계 : 연결 객체 얻기
			String url = "jdbc:mysql://localhost:3306/hellodb?serverTimezone=UTC";
			String user = "root";
			String pw = "root";
			con = DriverManager.getConnection(url,user,pw);
			System.out.println("연결 확인 : " + con);
			
			// 3단계 : SQL 생성
			String sql = "  INSERT INTO t_board (title, writer) ";
				   sql += " VALUES(?,?)";
			// ? (와일드 카드) : 입력받은 값을 쿼리로 채우겠다.
				   
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			System.out.println("제목 입력 : ");
			String title = s.nextLine();
			System.out.println("이름 입력 : ");
			String writer = s.nextLine();
				   
			// 4단계 : statement 객체로 질의(query) 생성
			pstmt = con.prepareStatement(sql);
			
			// 작성한 쿼리 채우기
			pstmt.setString(1, title); // 1번째 ? 에 입력 값 set
			pstmt.setString(2, writer);// 2번째 ? 에 입력 값 set 
			
			// 5단계 : SQL 실행
			int iCnt = pstmt.executeUpdate();
			//excuteUpdate() : 데이터가 수정되는 쿼리 수행 시
			System.out.println("총 " + iCnt + "개의 행이 추가되었습니다.");
				   
				   
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(con, pstmt);
		}

	}
}
