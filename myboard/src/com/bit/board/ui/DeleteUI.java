package com.bit.board.ui;

import com.bit.board.vo.BoardVO;

public class DeleteUI extends BaseUI{

	@Override
	public void process() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[게시글 삭제 선택]");
		
		int no = scanInt("삭제할 글 번호 입력");
		BoardVO board = new BoardVO();
		board.setNo(no);
		boolean flag = service.deleteBoard(board);
		
		if(flag)System.out.println("게시글을 삭제하였습니다. ");
		else System.out.println("게시 번호 [" + no +"]은 존재하지 않습니다.");
		
	}

}
