package com.bit.day10;

public class StrCmpMain {
	public static void main(String[] args) {
		String str = new String("Hello"); //string 객체 내에 hello라는 게 들어있는것, string 객체, str이라는 참조변수는 string 클래스 생성학 내부필드인 것을 hello로 초기화한것
		// 새로운 String 인스턴스를 생성하여, 내부 필드를 전달한 "Hello"로 초기화
		//	-> 전달되는 "Hello"자체는(문자열상수)
		
//		String str = "Hello";
		// 문자열 상수 "Hello"의 참조 데이터를 가진다. (상수 풀)
		
//		*상수풀에서는 똑같은 상수를 사용하면 새롭게 생성하지 않고, 그대로 사용한다. 이름이나 그런게 없다?
		// *Hello 하나를 만들어 놓고 그것만 공유해서 사용, 기법이름 = 풀링 : 하나만 사용하는 것 -> 메모리 절약  
		
//		if("Hello" == "Hello") {}
//		else {}  // dead code, if 에서 else로 넘어오지 않음, JVM이 같은걸 안다.
		
		
		/*
		 *  == : 두 객체의 동일성
		 *  equals() : 두 객체의 동등성(내용 비교)
		 *  
		*/
		
		// 참조(주소) 비교
		if (str == "Hello")
			System.out.println("str == Hello");
		else
			System.out.println("str != Hello");
		
		
		if(str.equals("Hello")) System.out.println("같은 문자열");
		else System.out.println("다른 문자열 ");
	}
}





