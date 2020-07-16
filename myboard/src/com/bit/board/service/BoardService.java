package com.bit.board.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.bit.board.BoardSequence;
import com.bit.board.dao.BoardDAO;
import com.bit.board.vo.BoardVO;

public class BoardService {
	private BoardDAO dao;
	
	public BoardService() {
		dao = new BoardDAO();
		
	}
	
	public void insertBoard(BoardVO board)throws Exception{
		// 게시판 글 등록 시 글 번호와 등록일을 포함하여 넣겠다.
		board.setNo(BoardSequence.getNo()); // 자동보유하기 위해서 시퀀스를 사용, 마지막번호를 기억하기 위해 파일로 내보냄.
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		String regDate = sdf.format(new Date());
		board.setRegData(regDate);
		
		dao.insertBoard(board);
		
	}

	public List<BoardVO> selectBoard() throws Exception{
		List<BoardVO> list = dao.selectBoard();
		return list;
	}
	
	public BoardVO selectOneBoard(BoardVO board) throws Exception{
		BoardVO result = dao.selectOneBoard(board);
		return result;
	}
	
	public boolean updateBoard(BoardVO board)throws Exception{
		return dao.updateBoard(board);
	}
	
	public boolean deleteBoard(BoardVO board) throws Exception{
		return dao.deleteBoard(board);
	}
	
	
}
