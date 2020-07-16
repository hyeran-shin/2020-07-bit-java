package com.bit.board.ui;

import com.bit.board.vo.BoardVO;

public class InsertUI extends BaseUI {

	@Override
	public void process() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[게시글 추가 선택]");
		
		String title = scanStr("등록할 글 제목 입력 : ");
		String writer = scanStr("등록할 작성자를 입력 : ");
		
		// 정보를 기억하는 클래스(VO)
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		// 유저와 소통하는 코드만 있어서 번호와 등록일은 서비스단으로 넘김
		int insertCnt = service.insertBoard(board);
		
		if(insertCnt!=0) System.out.println("게시글 등록을 완료하였습니다.");
		else System.out.println("게시글 등록을 실패하였습니다.");
	}

}

