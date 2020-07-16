package com.bit.board.ui;

import com.bit.board.vo.BoardVO;

public class SelectOneUI extends BaseUI {

	@Override
	public void process() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[특정 게시글 조회 선택]");
		
		// 1. 조회할 번호 입력
		int no = scanInt("조회할 글 번호 입력 : ");
		
		// 2. 정보를 기억하는 vo를 만들어 입력받은 번호를 기억
		BoardVO board = new BoardVO();
		board.setNo(no);
		
		// 3. 입력받은 번호를 가진 vo를 service로 전달하여 결과를 반환
		BoardVO result = service.selectOneBoard(board);
		
		// 4. 만약 조회된 게시물이 없을 경우(반환받은 결과가 없는 경우)
		if(result==null) {
			System.out.println("게시 번호 ["+no+"]은 존재하지 않습니다.");
			return;
		}
		
		// 5. 반환받은 vo 정보를 유저 화면에 출력
		System.out.println(result.getNo() + "번 게시글");
		System.out.println("-----------------------------------");
		System.out.println("번     호 : " + result.getNo());
		System.out.println("제     목 : " + result.getTitle());
		System.out.println("작 성 자 : " + result.getWriter());
		System.out.println("등 록 일 : " + result.getRegData());
		System.out.println("-----------------------------------");
	}

}
