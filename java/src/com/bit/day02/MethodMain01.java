package com.bit.day02;

public class MethodMain01 {
	/*
	 * 매개변수(parameter) - 받는시점
	 *  : 입력 시킬 데이터 타입 및 개수, 전달 순서대로 받는다
	 * 인자(argument) - 전달시점
	 *  : 메소드를 호출하여 사용 시 전달할 데이터	
	*/
	
	//1.반환형 o, 매개변수 x
	public static int getData() {
		return 10;
	}

	//2.반환형 o, 매개변수 o
	public static int add(int a, int b) {
		return a+b;
	}
	
	//3.반환형 x, 매개변수 x
	public static void prnString() {
		System.out.println("hello method");
	}
	
	//4.반환형x, 매개변수o
	public static void prnInfo(int age, double height) {
		System.out.println("나이 : " + age +" 키 : "+ height);
	}
	public static void main(String[] args) {

		System.out.println(getData());
		System.out.println(add(1,2));
		prnString();
		prnInfo(1, 190.5);
	}

}
