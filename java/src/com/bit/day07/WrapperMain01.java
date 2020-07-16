package com.bit.day07;

import java.math.BigDecimal;

public class WrapperMain01 {
	public static void main(String[] args) {
		/*
		 * Wrapper Class
		 * Integer
		 * Double
		 * ...
		 * 		-> 기본 데이터 타입을 객체로 사용하고 싶을 때 사용하는 Wrapper Class
		 * 
		 * Boxing		: 기본 데이터 타입을 객체로 감쌀 때
		 * UnBoxing		: 객체를 기본 데이터 타입으로 벗기겠다.
		*/

		Integer iVal = new Integer(10);
		// int형 상수 10을 Integer로 Boxing
		System.out.println(iVal);
		
		double dNum = 3.14;
		Double dVal = new Double(dNum);
		// double형 변수 dNum을 Double로 Boxing
		System.out.println(dVal);

		double subNum = dVal.doubleValue(); // UnBoxing
		System.out.println(subNum);
		
		System.out.println(iVal);
		iVal +=10;
		// 참조 변수 자체를 활용하여 값을 변경! iVal는 Integer타입(?)
		System.out.println(iVal);
		
		Integer num1 = 10; //리터럴 상수 10이 클래스 타입 Integer로 대입
		Integer num2 = 20; //Auto-Boxing : 자동으로 객체 타입으로 감싼다.
		num1++; //참조변수는 연산자를 사용할 수 없다.참조변수 = 객체라고 생ㅇ각 ,  가능한경우는: //1. UnBoxing 후에 2. Boxing 오브젝트로 변환해주는 과정을 이어서해준다.
		num2++; // num1 = new Integer(num1.intValue() + 1 )
		//num1.intValue() : UnBoxing
		//new Integer  	  : Boxing 
		System.out.println(num1);
		System.out.println(num2);
		
		// 실수는 오차가 존재
		double d1 = 1.6;
		double d2 = 0.1;
		System.out.println(d1+d2);
		
		// 오차가 없도록 문자열 형태로!!
		BigDecimal e1 = new BigDecimal("1.6");
		BigDecimal e2 = new BigDecimal("0.1");
		System.out.println(e1.add(e2));
		
		BigDecimal e3 = new BigDecimal(1.6); 
		BigDecimal e4 = new BigDecimal(0.1);
		System.out.println(e3.add(e4)); // 오차 존재하지만 double은 15자리? 보다 더 많은 자리수를 나오기위해 사용
		
		
	}

}








