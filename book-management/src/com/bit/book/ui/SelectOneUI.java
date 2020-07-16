package com.bit.book.ui;

import java.util.HashMap;
import java.util.List;

import com.bit.book.vo.BookVO;

public class SelectOneUI extends BaseUI {

	// 책 정보 출력 시 isbn, 제목, 저자, 가격, 대여여부출력
	// isbn, 제목으로 검색 시 동일 책 정도 모두 출력 (2개임)
	@Override
	public void process() throws Exception {
		System.out.println("4. 도서 검색");
		HashMap<Integer, String> searchMap = new HashMap<>(); // 검색기준과 키워드 저장을 위한 hashmap

		while (true) {
			System.out.println("검색할 기준을 고르세요");
			int type = scanInt("[1] : ISBN으로 검색 \n[2] : 제목으로 검색");
			if (type < 0 || type > 2) {
				System.out.println("해당 기준이 없습니다. 다시 입력하세요. ");
				continue;
			}

			String keyword = scanStr("키워드 입력 : ");
			// str을 넘겨서 sql 쿼리문 ? 에 set.

			searchMap.put(type, keyword);
			List<BookVO> bookList = service.bookSelectOne(searchMap);
			if (bookList == null) {
				System.out.println("해당 없음 ");
			} else {
				for (BookVO vo : bookList) {
					System.out.println("=========================");
					System.out.println("ISBN   : " + vo.getIsbn());
					System.out.println("제목        : " + vo.getTitle());
					System.out.println("저자        : " + vo.getAutor());
					System.out.println("가격        : " + vo.getPrice());
					System.out.println("대여 여부 : " + (vo.getRental() == 0 ? "대여 불가" : "대여 중"));
				}
			}
			break;
		}

	}

}