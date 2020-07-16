package com.bit.day07;

public class WrapperMain02 {
	public static void main(String[] args) {
		int i = Integer.parseInt("12345"); //문자열 -> 숫자로
		// parseInt(...) : 해당 데이터 타입으로 변환(파싱)
		System.out.println(i);
		
		Integer i2 = Integer.parseInt("12345");
		String s = String.valueOf(123123);
		double b = Double.parseDouble("123");
		
		System.out.println(i2);
		System.out.println(s);
		System.out.println(b);
				
		// A :10, B:11, ... , F:15
		int num = Character.getNumericValue('F'); //16진수 값으로
		System.out.println(num);
		
		
		//'f'를 16진수 숫자로 표현
//		int i3 = Integer.parseInt("f",13); // NumberFormatException 발생
		int i3 = Integer.parseInt("f",16);
		System.out.println("f: " + i3);
		
		// 15를 2진수 문자열로 반환
		String s2 = Integer.toBinaryString(15);
		System.out.println(s2);
		//Q. 특정 정수를 입력받아 2진수 형태로 변환하는 프로그램 작성
		// 단, 메소드 사용하지 말고 / 조건문과 반복문만 이용해서 
		
		// 비트 단위 1의 개수
		int bitCount = Integer.bitCount(15);
		System.out.println("bitCount : " + bitCount);
		//Q. 위에서 변환된 2진수의 비트단위 1의 개수를 구하세요.
		
		//255의 16진수 표현
		String hexStr = Integer.toHexString(255);
		System.out.println(hexStr);
		
	}
}





