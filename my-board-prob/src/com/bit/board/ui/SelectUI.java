package com.bit.board.ui;

import java.util.List;

import com.bit.board.vo.BoardVO;

public class SelectUI extends BaseUI {

	@Override
	public void process() throws Exception {
		System.out.println("[전체 게시글 조회 선택]");

		List<BoardVO> list = service.selectBoard();

		System.out.println("게시글 목록 ( " + list.size() + ")");
		System.out.println("----------------------------------------");
		System.out.println("번호\t작성자\t등록일\t\t제목");
		System.out.println("========================================");


		for(BoardVO vo : list) {
			System.out.print(vo.getNo() + "\t");
			System.out.print(vo.getWriter() + "\t");
			System.out.print(vo.getRegData() + "\t");
			System.out.println(vo.getTitle() + "\t");
		}
		if (list.isEmpty())
			System.out.println("\t조회된 게시물이 존재하지 않습니다.");
		System.out.println("----------------------------------------");
	}

}
