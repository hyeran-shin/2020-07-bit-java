package com.bit.day04.cap;

public class Subtraction {

	private int subCnt;

	Subtraction() {
		subCnt = 0;
	}

	int getSubCnt() {
		return subCnt;
	}

	int subTwoNumber(int a, int b) {
		subCnt++;
		if (a >= b)
			return a - b;
		else
			return b - a;
	}
}
