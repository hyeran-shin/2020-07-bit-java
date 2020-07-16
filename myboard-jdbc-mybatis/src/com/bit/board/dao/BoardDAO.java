package com.bit.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bit.board.MysqlSessionFactory;
import com.bit.board.vo.BoardVO;

// DAO : Data Access Object
//   -> 데이터베이스(파일 시스템)에 접근하기 위한객체 

public class BoardDAO {
	private SqlSession session = null;
	
	public BoardDAO() {
		super(); 
		session = new MysqlSessionFactory().getInstance();
	}
	
	/**
	 * 게시글 등록 기능
	 */
	public int insertBoard(BoardVO board) throws Exception {
		int insertCnt = 0;
		insertCnt = session.insert("com.bit.insertBoard", board);
		session.commit();
		return insertCnt;
	}
	
	/**
	 *  전체 게시글 조회
	*/
	public List<BoardVO> selectBoard() throws Exception{
		List<BoardVO> boardList = session.selectList("com.bit.selectBoard");
		return boardList;
		
	}

	/**
	 *  게시글 번호 조회
	*/  
	public BoardVO selectOneBoard(BoardVO board)  throws Exception {
		BoardVO vo = session.selectOne("com.bit.selectOneBoard", board);	
		return vo;		
	}
	

	
	/**
	 * 게시글 수정
	 */
	public int updateBoard(BoardVO board) {
		int updateCnt = 0;
		updateCnt = session.update("com.bit.updateBoard",board);
		session.commit();
		return updateCnt;
		
	}

	
	/**
	 * 게시물 삭제 
	*/
	public int deleteBoard(BoardVO board) {
		int deleteCnt = 0;
		deleteCnt = session.delete("com.bit.deleteBoard",board);
		session.commit();
		return deleteCnt;
	}
	
	



}
