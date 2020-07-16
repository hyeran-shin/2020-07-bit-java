package com.bit.board.ui;

import com.bit.board.vo.BoardVO;

public class UpdateUI extends BaseUI {

	@Override
	public void process() throws Exception {
		System.out.println("[게시글 수정 선택]");
		
		int no = scanInt("수정할 글 번호를 입력하세요 : ");
		String title = scanStr("변경할 글 제목을 입력하세요 : " );
		
		BoardVO vo = new BoardVO();
		vo.setNo(no);
		vo.setTitle(title);
		
		boolean flag = service.updateBoard(vo);
		if(flag) System.out.println("게시글 수정 완료");
		else System.out.println("게시번호 [" + no +"]은 존재하지 않습니다.");
		
		
	}

}
