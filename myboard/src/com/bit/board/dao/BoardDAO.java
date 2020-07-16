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

// DAO : Data Access Object
//   -> 데이터베이스(파일 시스템)에 접근하기 위한객체 

public class BoardDAO {
	private List<BoardVO> boardList = new ArrayList<>();	
	private String filePath = "board_object.txt" ;  //db의 이름?이라고 생각
	private File fObj;
	
	public BoardDAO() {
		fObj = new File(filePath); //프로젝트안에서 없으면 만들어라.
		loading();
	}
	
	/**
	 * 게시글 등록 기능
	 */
	public void insertBoard(BoardVO board) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			boardList.add(board);
			oos.writeObject(boardList);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(oos,fos);
		}
	}
	
	/**
	 *  전체 게시글 조회
	*/
	public List<BoardVO> selectBoard(){
		return boardList;
	}

	/**
	 *  게시글 번호 조회
	*/  
	public BoardVO selectOneBoard(BoardVO board) {
		for(BoardVO vo : boardList) {
			if(vo.getNo() == board.getNo()) {
				return vo;
			}
		}
		return null;
	}
	
	
	/**
	 * 게시글 수정
	 */
	public boolean updateBoard(BoardVO board) {
		boolean selectFlag = false; // 조회 여부 , 
		if(boardList.isEmpty()) // 게시글이 하나도 없다면
			return selectFlag;  // 조회 작업 전 false 반환
			
		for(BoardVO vo : boardList) {		// 게시글이 존재한다면,
			if(vo.getNo()==board.getNo()) { // 해당 번호에 대한 게시글을 찾고,
				selectFlag=true; 			// 찾았다는 표시를 true 설정과
				vo.setTitle(board.getTitle()); // 수정할 내용으로 변경(setter)
				/*
				 * foreach 루프 상태에서
				 * BoardVO vo = boardList.get(0); -> 첫 번째 루프
				 * BoardVO vo = boardList.get(1); -> 두 번째 루프
				 * 
				 * 단, 객체 간의 대입 과정을 생각한다면
				 * boardList가 담고있는 첫 번째 객체(VO)의 위치정보(주소)를
				 * BoardVO vo가 담는 것이다. 
				 * 대입된 [l-value] vo는 실제 boardList 내의 주소를 참조하게 된다.
				 * 
				*/
				
//				vo = new BoardVO();
				// 참조의 목적 - > vo를 다른 것으로 담을 뿐이지 list 변경 x 
				break;						// 루프 종료
			}
		}

		if(selectFlag)// 수정할 게시 번호가 존재한다면,
			boardFileWrite(); //데이터베이스(파일시스템)를 변경
		return selectFlag;
		// 수정할 게시번호가 없을 경우와 수정 성공 후 경과를 반환
	}

	/**
	 * 게시물 삭제 
	*/
	public boolean deleteBoard(BoardVO board) {
		boolean deleteFlag = false;
		if(boardList.isEmpty()) return deleteFlag;
		for(BoardVO vo : boardList) {
			if(vo.getNo() == board.getNo()) {
				deleteFlag = true;
				boardList.remove(vo);
				break;
			}
		}
		if(deleteFlag)
			boardFileWrite();
		return deleteFlag;
	}
	
	/**
	 * 파일 저장(수정 및 삭제 시)
	 */
	private void boardFileWrite() {
		try(
				FileOutputStream fos = new FileOutputStream(fObj);
				ObjectOutputStream oos = new ObjectOutputStream(fos)
		){
			oos.writeObject(boardList);
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 파일 로딩
	 * @author qweqwe
	 * @param 파라미터값
	 * 
	*/

	@SuppressWarnings("unchecked")
	private void loading() { // 파일에서 가지고와서 boardList에 넣어놓겠다.
		try (
				FileInputStream fis = new FileInputStream(filePath);
				ObjectInputStream ois = new ObjectInputStream(fis);
		) {
			boardList = (List<BoardVO>)ois.readObject();
			
			
		}catch(FileNotFoundException fnfe) {
			// *Exception Handling
		}catch(Exception e) {
			e.printStackTrace();
		}
	}



}
