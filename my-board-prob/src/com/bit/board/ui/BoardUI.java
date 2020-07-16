package com.bit.board.ui;

import com.bit.board.BoardUIMapping;

public class BoardUI extends BaseUI {

	String[] key = { "exit", "select", "selectOne", "insert", "update", "delete" };

	@Override
	public void process() throws Exception {
		BoardUIMapping mapping = new BoardUIMapping();

		while (true) {
			int type = menu();
			if (type >= key.length) {
				System.out.println("잘못된 메뉴를 선택하였습니다.");
				continue;
			}

			IBoardUI ui = mapping.getBoardUI(key[type]);
			if (ui != null)
				ui.process();
		}
	}

	private int menu() {
		System.out.println("------------------");
		System.out.println("[게시판 관리 프로그램]");
		System.out.println("------------------");
		System.out.println("1. 전체 게시글 조회");
		System.out.println("2. 특정 게시글 조회");
		System.out.println("3. 게시글 등록");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 종료");
		System.out.println("------------------");

		int type = scanInt("메뉴 중 처리할 항목 선택 : ");
		return type;
	}
}
