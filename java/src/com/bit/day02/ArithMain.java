package com.bit.day02;

public class ArithMain {
	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 3;
		int result = n1+n2;
		System.out.println("덧셈 결과 : " + result);
		
		result = n1-n2;
		System.out.println("뺄셈 결과 : " + result);
		
		//나누기 연산
		System.out.println(10/3);
		System.out.println(10./3.);
		System.out.println(10/3.);
		System.out.println(10./3);
		System.out.println(-7/3);
		System.out.println(7/-3);
		
		//복합대입연산자  : +=
		//관계 연산자(비교 연산자) :
		System.out.println("a > b : " + (10>20));
		System.out.println("a > b : " + (10!=20));
		
		//문자열
		String str = "Hello";
		System.out.println(str + "10");
		System.out.println(str + 10);
		
		//연산은 서로의 타입이 일치하여야 수행된다.
		System.out.println(10 +  3.14); // 자동형변환
		System.out.println((double)10 + 3.14); // 자동형변환 되지만 단순 표시의 용도
		
		//논리 연산자
		/*
		 * && : and, 둘 다 true이면, 연산결과 true
		 * || : or, 둘 다 false이면, 연산결과 false 
		 * 		둘 중 하나라도 true false, 연산 결과는 true
		 * ! : not
		 * 
		*/	
		
		int num1= 10, num2 = 20;
		boolean re1 = (num1 != 10) && (num2 == 20);
		System.out.println(re1);
		/*
		 * SCE(Short-Circuit Evaluation)
		 *  - a 수식의 연결과가 논리 연산의 결과로 결정된다면, b 수식 수행하지 않는다.
		 *  
		*/
		
		//증감 연산자
		int n=7;
		int temp;
		System.out.println(n++); //7
		// n = 8
		System.out.println(temp=--n); //7
 		System.out.println(--temp); //6
		System.out.println(temp +n );//6+7=13
		System.out.println(temp-- +1); //7
		System.out.println(n--);//7
		System.out.println(n);//6
		System.out.println(temp);//5
		
		//비트논리연산자 (비트단위)
		/*
		 * 비트 단위(2진수)로 각 자리수끼리 논리 연산을 수행
		 * true(1), false(0)
		 * 
		 * & : 비트 단위 AND
		 * | : OR
		 * ^ : XOR
		 *    -> 두 논리가 같으면 거짓, 다르면 참
		 * ~ : NOT
		*/
		
		int n11 =5, n22=3, n33=-1;
		System.out.println(n11 & n22);
		System.out.println(n11|n22);
		System.out.println(~n33);
		
		int x=5, y=3;
		//xor 연산자 이용한 swap
		x^=y;
		y^=x;
		x^=y;
		
		System.out.println(x);
		System.out.println(y);
		
		//대소문자 변환
		char c1 ='A'; //65
		char c2 ='a'; //97
		//대문자 인지 소문자인지 알아야 변환이 가능
		// 대문자이면 +32, 소문자라면 -32
		System.out.printf("%c\n",c1+32);
		System.out.printf("%c\n",c2-32);
		
		//대소문자 구분하지 않고 모두 동일한 XOR 연산
		System.out.printf("%c\n",c1 ^32);
		System.out.printf("%c\n",c2 ^32);
		
		//비트 이동 연산자(비트 쉬프트)
		//2의 제곱수만큼 곱하거나, 나눌때활용
		int inum1=2100000000;
		int inum2=2050000000;
		System.out.println((inum1+inum2)/2);
		
	
		
		//int형 정수 표현의 최대값
		System.out.println("-1>>>1 : "+(-1>>>1));
		
		
		
		
		
	}
}
