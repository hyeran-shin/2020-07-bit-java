package com.bit.day05.prob;

public class Book {

	private int bNum;
	private String bName;
	private String bWriter;
	private int stateCode = 1;

	Book(int bNum, String bName, String bWriter) {
		this.bNum = bNum;
		this.bName = bName;
		this.bWriter = bWriter;
	}

	int getBookNo() {
		return this.bNum;
	}

	void rent() {
		System.out.println(" '" + this.bName + "' 대여 완료 ");
		stateCode = 0;
	}

	void print() {
		if(this.stateCode==0) {
			System.out.println("도서 번호 : " + this.bNum + ", 제목 : " + this.bName + 
								", 저자 : " + this.bWriter 
								+ ", 대여 여부 : 불가(대여 중)" );
		}else {
			System.out.println("도서 번호 : " + this.bNum + ", 제목 : " + this.bName + 
					", 저자 : " + this.bWriter 
					+ ", 대여 여부 : 가능" );
		}
	}

}
