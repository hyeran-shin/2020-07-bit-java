package com.bit.board.ui;

import com.bit.board.vo.BoardVO;

public class SelectOneUI extends BaseUI {

	@Override
	public void process() throws Exception {
		System.out.println("[특정 게시글 조회]");

		int no = scanInt("조회할 글 번호 입력 : ");
		BoardVO vo = new BoardVO();
		vo.setNo(no);
		BoardVO result = service.selectOneBoard(vo);
		if (result == null) {
			System.out.println("게시 번호 [" + no + "]은 존재하지 않습니다.");

			return;
		}
		System.out.println(result.getNo() + "번 게시글");
		System.out.println("-----------------------------------");
		System.out.println("번     호 : " + result.getNo());
		System.out.println("제     목 : " + result.getTitle());
		System.out.println("작 성 자 : " + result.getWriter());
		System.out.println("등 록 일 : " + result.getRegData());
		System.out.println("-----------------------------------");
	}

}
