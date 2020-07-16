package com.bit.board.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.bit.board.util.FileClose;
import com.bit.board.vo.BoardVO;

public class BoardDAO {
	private List<BoardVO> boardList = new ArrayList<>();
	private String filePath = "board_object.txt";
	private File fObj;

	public BoardDAO() {
		fObj = new File(filePath);
		loading();
	}

	public List<BoardVO> selectBoard() {
		return boardList;
	}

	public void insertBoard(BoardVO vo) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			boardList.add(vo);
			oos.writeObject(boardList);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos, fos);
		}
	}

	public BoardVO selectOneBoard(BoardVO vo) {
		for(BoardVO boardVO : boardList) {
			if( boardVO.getNo() == vo.getNo()) {
				return boardVO;
			}
		}
		return null;
	}
	
	public boolean updateBoard(BoardVO vo) {
		boolean selectFlag = false;
		if(boardList.isEmpty()) {
			return selectFlag;
		}
		for(BoardVO boardVO : boardList) {
			if(boardVO.getNo() == vo.getNo()) {
				selectFlag = true;
				vo.setTitle(vo.getTitle());
				break;
			}
		}
		
		if(selectFlag) {
			boardFileWrite(); // 파일시스템 변경
		}
		return selectFlag;
	}
	
	public boolean deleteBoard(BoardVO vo) {
		boolean deleteFlag = false;
		if(boardList.isEmpty()) return deleteFlag;
		for(BoardVO boardVO : boardList) {
			if(boardVO.getNo() == vo.getNo()) {
				deleteFlag = true;
				boardList.remove(boardVO);
				break;
			}
		}
		if(deleteFlag) boardFileWrite();
		return deleteFlag;
	}
	// 파일 로딩
	@SuppressWarnings("unchecked")
	private void loading() {
		try (
				FileInputStream fis = new FileInputStream(filePath);
				ObjectInputStream ois = new ObjectInputStream(fis);
		){
			boardList =(List<BoardVO>)ois.readObject();
		}catch(FileNotFoundException fnfe) {
			// *Exception Handling
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 파일 저장 (수정 및 삭제 시)
	private void boardFileWrite() {
		try(
				FileOutputStream fos = new FileOutputStream(fObj);
				ObjectOutputStream oos = new ObjectOutputStream(fos)
		){
			oos.writeObject(boardList);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
