package com.bit.board.ui;

import com.bit.board.vo.BoardVO;

public class InsertUI extends BaseUI{
	
	@Override
	public void process() throws Exception {
		System.out.println("[게시글 추가 선택]");
		
		String title = scanStr("등록할 글 제목 입력 :");
		String writer = scanStr("등록할 작성자 입력 : ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		
		service.insertBoard(board);
		
		System.out.println("게시글 등록을 완료하였습니다.");
	}
}
