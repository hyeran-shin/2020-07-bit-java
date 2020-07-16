package com.bit.board.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.bit.board.BoardSequence;
import com.bit.board.dao.BoardDAO;
import com.bit.board.vo.BoardVO;

public class BoardService {
	BoardDAO dao;

	public BoardService() {
		dao = new BoardDAO();
	}

	public List<BoardVO> selectBoard() throws Exception{
		return dao.selectBoard();
	}

	public void insertBoard(BoardVO vo) throws Exception {
		int no = BoardSequence.getNo();
		vo.setNo(no);
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		String regDate = sdf.format(new Date());
		vo.setRegData(regDate);

		dao.insertBoard(vo);
	}
	
	public BoardVO selectOneBoard(BoardVO vo)throws Exception {
		return dao.selectOneBoard(vo);
	}
	public boolean updateBoard(BoardVO vo)throws Exception {
		return dao.updateBoard(vo);
	}
	public boolean deleteBoard(BoardVO vo) throws Exception{
		return dao.deleteBoard(vo);
	}
}
