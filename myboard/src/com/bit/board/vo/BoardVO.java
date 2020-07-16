package com.bit.board.vo;

import java.io.Serializable;

// VO : Value Object
//  -> 게시글 정보를 기억 또는 전달하기 위한 객체
public class BoardVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 이 VO 가 id가 어떤거냐에 따라 jvm 이 식별하는게 다르다.
	// 자동으로 부여된다. 객체자체를 식별자 값이라고 생각., 유저식별자
	
	private int no;
	private String title;
	private String writer;
	private String regData;
	
	public BoardVO() {
		super();
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegData() {
		return regData;
	}
	public void setRegData(String regData) {
		this.regData = regData;
	}
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", weiter=" + writer + ", regData=" + regData
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}
