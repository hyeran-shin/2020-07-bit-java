package com.bit.day04.cap;

public class Calculator {

	// 각 기능의 참조변수를 private으로 선언
	private Addition add;
	private Subtraction sub;
	private Division div;

	public Calculator() {
		add = new Addition();
		sub = new Subtraction();
		div = new Division();
	}

	public int addTwoNumber(int a, int b) {
		return add.addTwoNumber(a, b);
	}

	public int subTwoNumber(int a, int b) {
		return sub.subTwoNumber(a, b);
	}
	
	public int divTwoNumber(int a, int b) {
		// 잘못된 값이 전달 시에 대한 처리
		if(a>0 & b>0) return div.divTwoNumber(a, b);
		else return -1;
	}
	
	public void prnCnt() {
		System.out.println("덧셈 수 : "+ add.getAddCnt());
		System.out.println("뺄셈 수 : "+ sub.getSubCnt());
		System.out.println("나눗셈 수 : " + div.getDivCnt());
	}

	
}
