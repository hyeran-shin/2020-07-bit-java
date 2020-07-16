package com.bit.book.service;

import java.util.HashMap;
import java.util.List;

import com.bit.book.dao.BookDAO;
import com.bit.book.vo.BookVO;

public class BookService {

	private BookDAO dao;

	public BookService() {
		dao = new BookDAO();
	}

	// 전체 조회
	public List<BookVO> bookSelect() throws Exception {
		return dao.bookSelect();
	}

	// 검색 조회
	public List<BookVO> bookSelectOne(HashMap<Integer, String> searchMap) throws Exception {
		return dao.bookSelectOne(searchMap);
	}
}
