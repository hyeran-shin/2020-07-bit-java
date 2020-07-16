package com.bit.day01;

/*
1. System.out.println() : print() + 개행문자
2. System.out.print(정수,실수,문자,문자열)
3. System.out.printf()
	-> 정해진 문서양식(format)에 따라 원하는 방식으로 데이터를 출력
*/
public class PrintMain {
	public static void main(String[] args) {
		System.out.println(12);
		System.out.print(12.34);
		System.out.println('A');
		System.out.println("ABC");
		
		//개행만을 목적으로 사용
		System.out.println();
		System.out.println("");
		
		//%d, %c : 서식문자
		// \n : 개행문자
		System.out.printf("%d\n%c\n",12,'A');	
		
		System.out.println("-----------");
		/*		
		\r\n : 윈도우 출생
		\n : 리눅스 출생
		\r : 맥 출생
		
		%n : 해당 플랫폼별 줄 바꿈 문자 출력(독립적)
		\n : 플랫폼에 종속적인 줄바꿈 문자 출력
		독립적 : 이식성이 뛰어나다.
		종속적 : 이식성이 떨어진다.
		
		*/		
		System.out.printf("%d\r\n%c\n",12,'A');
		System.out.printf("%d\r%c\n",12,'A');
		System.out.printf("%d\n%c\n",12,'A');
		System.out.printf("%d%n%c\n",12,'A');
		
		
		System.out.println();
		System.out.println(12+' '+12.34);
		//자바는 유니코드 기반
		//공백 문자의 코드 값은 32 12+32+12.34 수행
		System.out.println(12+" "+12.34);
		// ' ' : 단일문자 ->char
		// " " : 문자열(문장) ->
	}
}
