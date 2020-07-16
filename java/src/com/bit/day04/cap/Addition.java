package com.bit.day04.cap;

public class Addition {

	private int addCnt; // 외부에서 addCnt 직접 접근 불사
	
	Addition(){
		addCnt = 0;
	}
	
	// 접근자 메소드 (Access Method)
	int getAddCnt() { // 값만 확인하도록 getter를 정의 
		return addCnt;
	}
	
	// 실제 덧셈 기능을 수행하는 메소드
	int addTwoNumber(int a, int b) {
		addCnt++;
		return a+b;
	}
}
