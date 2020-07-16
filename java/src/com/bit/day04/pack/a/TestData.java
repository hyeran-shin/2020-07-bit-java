package com.bit.day04.pack.a;


// 접근이라는 것은 클래스명, 생성자명, 필드명을 다른 곳에서 사용하는 것
// default class
class Pen{ // 접근 지정자가 생략되어 있다.
	int length;
//	Pen(){ };
	public Pen() {} // default 클래스, public 생성자
}

// private class Phone{} // 컴파일 에러
class Phone{
	@SuppressWarnings("unused")
	private class Address{ // 내부 클래스 가능
		// Phone 클래스 내에서만 사용할 내부 클래스 정의
	}
}

public class TestData {
	Pen p; // Pen클래스명 접근 가능 
	
	public String name;
	protected String id;
	String addr;
	@SuppressWarnings("unused")
	private int money;
	
//	TestData(){ // default, 외부에서 생성자 호출 불가능, 생성 불가
	public TestData() { // 생성자를 모두 public으로 만들어도 결국 클래스의 접근 지정자에 영향을 받는다.
		// 클래스 내부에서는 모두 접근 가능
		name = "모카";
		id = "e-1001";
		addr = "서울";
		money = 2300;
		
	}
}
