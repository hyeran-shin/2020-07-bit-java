package com.bit.book.ui;

import com.bit.book.factory.UIMapping;

// 첫 시작 
public class MenuUI extends BaseUI {

	String[] key = { "exit", "insert", "delete", "select", "selectOne", "update" };

	@Override
	public void process() throws Exception {
		UIMapping mapping = new UIMapping();

		while (true) {
			int type = menu();
			if(type>=key.length) {
				System.out.println("잘못된 메뉴를 선택하였습니다.");
				continue;
			}
			IBookUI ui = mapping.getUI(key[type]);
			if (ui != null) {
				ui.process();
			}
		}

	}

	private int menu() {
		System.out.println("----------------------");
		System.out.println("[ 도서 관리 프로그램 ] ");
		System.out.println("----------------------");
		System.out.println("1. 도서 추가");
		System.out.println("2. 도서 삭제");
		System.out.println("3. 도서 목록");
		System.out.println("4. 도서 검색");
		System.out.println("5. 도서 대여");
		System.out.println("0. 종료");

		int type = scanInt("메뉴 중 처리할 항목 선택 : ");
		return type;
	}

}
