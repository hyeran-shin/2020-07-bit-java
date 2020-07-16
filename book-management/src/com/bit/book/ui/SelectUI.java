package com.bit.book.ui;

import java.util.List;

import com.bit.book.vo.BookVO;

public class SelectUI extends BaseUI {

	@Override
	public void process() throws Exception {
		System.out.println("3. 도서 목록");
		
		
		List<BookVO> bookList = service.bookSelect();
		System.out.println("총 " + bookList.size() + "개의 목록");
		for(BookVO vo : bookList) {
			System.out.println("=========================");
			System.out.println("ISBN   : "+vo.getIsbn());
			System.out.println("제목        : " + vo.getTitle());
			System.out.println("저자        : " + vo.getAutor());
			System.out.println("가격        : " + vo.getPrice());
			System.out.println("대여 여부 : " + (vo.getRental()==0?"대여 불가":"대여 중"));
			
		}
		

	}

}