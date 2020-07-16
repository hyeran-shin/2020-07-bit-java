package com.bit.day04.cap;

public class Division {
	private int divCnt;
	
	Division(){
		divCnt = 0;
	}
	
	int getDivCnt() {
		return divCnt;
	}
	
	int divTwoNumber(int a, int b) {
		divCnt++;
		if(a>=b) return a/b;
		else return b/a;
	}

}
