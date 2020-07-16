package com.bit.board.ui;

import com.bit.board.vo.BoardVO;

public class UpdateUI extends BaseUI {

	@Override
	public void process() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[게시글 수정 선택]");

		int no = scanInt("수정할 글 번호 입력 : ");
		String title = scanStr("변경할 글 제목을 입력 : ");

		BoardVO board = new BoardVO();
		board.setNo(no);
		board.setTitle(title);

		int updateCnt = service.updateBoard(board);

		if (updateCnt != 0) {
			System.out.println("게시글을 수정하였습니다.");
		} else {
			System.out.println("게시글을 수정에 실패하였습니다.");
			System.out.println("게시 번호 [" + no + "]은 존재하지 않습니다.");
		}
	}

}
