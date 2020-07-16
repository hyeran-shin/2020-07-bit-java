package com.bit.day04;

import com.bit.day04.cap.Calculator;

// com.bit.day04.cap 캡슐화 예제
public class CalculatorMain {

	public static void main(String[] args) {
		// 캡슐화 외부 시점
		Calculator cal = new Calculator();
		System.out.println("3 + 8 = " + cal.addTwoNumber(3, 8));
		System.out.println("2 + 3 = " + cal.addTwoNumber(2, 3));

		System.out.println("9 - 2 = " + cal.subTwoNumber(9, 2));
		System.out.println("9 - 2 = " + cal.subTwoNumber(2, 9));
		System.out.println("9 - 2 = " + cal.subTwoNumber(2, 100));
		
		System.out.println("8 / 2 = " + cal.divTwoNumber(2, 8));
		System.out.println("4 / 0 = " + cal.divTwoNumber(0, 4));
		
		cal.prnCnt();
		
	}

}
