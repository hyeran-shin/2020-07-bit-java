package com.bit.day01;

public class TypeMain {
	public static void main(String[] args) {
		boolean bool = true;
		System.out.println(bool);
		
		char c = 'a';
		System.out.println(c);
		
		byte b = 20;
		System.out.println(b);
		System.out.println("byte의 크기 : " + Byte.SIZE);
		
		short s =20;
		System.out.println(s);
		System.out.println("short의 크기 : " + Short.SIZE);
		
		int i=10;
		System.out.println(i);
		System.out.println("int의 크기 : "+Integer.SIZE);
		

		long l=10;
		System.out.println(l);
		System.out.println("long의 크기 : "+Long.SIZE);
		
		float f =3.5f;
		//실수 리터럴 상수의 기본 데이터 타입은 double
		//데이터타입이 일치해야만 값을 저장 가능
		//3.5는 기본적으로 double 형식, float에 저장할 수 없다.
		//3.5f -> 접미사 : 데이터 타입을 변환하기 위해 활용
		//	   -> 3.5를 float 형태로 변환
		System.out.println(f);
		System.out.println("float의 크기 : "+Float.SIZE);
		
		double d= 3.14;
		System.out.println(d);
		System.out.println("double의 크기 : "+Double.SIZE);
		
		
	
	}

}
