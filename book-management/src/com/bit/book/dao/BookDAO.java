package com.bit.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.bit.book.factory.ConnectionFactory;
import com.bit.book.util.JDBCClose;
import com.bit.book.vo.BookVO;

public class BookDAO {

	private List<BookVO> bookList = new ArrayList<>();
	private ConnectionFactory conFactory = ConnectionFactory.getConInstance();
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	StringBuilder sql;

	// 전체 조회
	public List<BookVO> bookSelect() throws Exception {
		bookList.clear();
		con = conFactory.getConnection();
		sql = new StringBuilder();
		sql.append("  select * from book order by isbn limit 3   ");
		pstmt = con.prepareStatement(sql.toString());
		rs = pstmt.executeQuery();

		while (rs.next()) {
			int no = rs.getInt("no");
			String isbn = rs.getString("isbn");
			String title = rs.getString("title");
			String autor = rs.getString("autor");
			int price = rs.getInt("price");
			int rental = rs.getInt("rental");

			BookVO vo = new BookVO(no, isbn, title, autor, price, rental);
			bookList.add(vo);
		}
		JDBCClose.close(con, pstmt);
		return bookList;
	}

	// 검색 조회
	public List<BookVO> bookSelectOne(HashMap<Integer, String> searchMap) throws Exception {
		con = conFactory.getConnection();
		int type = 0;
		String keyword = null;
		for (Entry<Integer, String> entry : searchMap.entrySet()) {
			type = entry.getKey();
			keyword = entry.getValue();
			System.out.println(type + " ======== " + keyword);
		}
		sql = new StringBuilder();
		if (type == 1) {
			sql.append(" select * from book where isbn = ?  "); // ex) isbn=165456
		}
		if (type == 2) {
			sql.append(" select * from book where title like ?  "); // ex) 제목 = "스프링~~"
		}

		pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1, keyword);
		rs = pstmt.executeQuery();

		if (!rs.next())
			return null; // 해당 게시물 없음
		
		while (rs.next()) {
			int no = rs.getInt("no");
			String isbn = rs.getString("isbn");
			String title = rs.getString("title");
			String autor = rs.getString("autor");
			int price = rs.getInt("price");
			int rental = rs.getInt("rental");

			BookVO vo = new BookVO(no, isbn, title, autor, price, rental);
			bookList.add(vo);
		}

		return bookList;
	}

}
