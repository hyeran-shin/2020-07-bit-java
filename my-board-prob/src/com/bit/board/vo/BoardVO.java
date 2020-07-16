package com.bit.board.vo;

import java.io.Serializable;

public class BoardVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4207762823876757513L;
	
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegData() {
		return regData;
	}

	public void setRegData(String regData) {
		this.regData = regData;
	}

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", regData=" + regData + "]";
	}

}
