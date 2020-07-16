package com.bit.day04.pack.b;

import com.bit.day04.pack.a.TestData;

public class TestMain {
	public static void main(String[] args) {
//		 Pen p;
		// 다른 패키지의 default class 접근 불가
//		new Pen();
		// default class 의 public 생성자는 어차피 사용이 불가
		/*
		 * TestData 클래스의 접근 지정자는 public 이고
		 * TestData 생성자의 접근 지정자는 default 라면
		 * 참조 변수는 선언 가능하되, 생성자 호출 불가능
		*/
		TestData td = new TestData();
		
		System.out.println(td.name);
//		System.out.println(td.id);
//		// protected, 상속 관계가 아니라 접근 불가
//		System.out.println(td.addr);
//		// default, 다른 패키지에서 접근 불가
//		System.out.println(td.money);
//		// private, 다른 클래스에서 접근 불가
		
		
		
	}
}
