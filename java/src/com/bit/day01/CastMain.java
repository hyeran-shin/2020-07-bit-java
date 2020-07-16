package com.bit.day01;

/*
 * 형변환(Casting)
 * 		= 대입연산자, + - *  /산술연산자를 기준으로
 * 		     좌항과 우항의 자료형(Data Type)이 다른 경우
 *     [좌항] = [우항]
 * [1-value] = [r-value]
 * 			i=10
 * 
 * byte < short < int < long < float < double
 *        char
 *        
 * implicity : 자동 형변환, 묵시적 형변환, 암시적 형변환
 * 		- 큰 그릇에 작은 그릇을 담는 형태
 * explicity : 강제 형변환, 명시적 형변환
 * 		- 작은 그릇에 큰 그릇을 담는 형태
 * 		- 큰 그릇을 부셔 작은 그릇에 담는다면, 원래의 형태가 유지되지 않는다.
*/

public class CastMain {
	public static void main(String[] args) {
		int a =10;
		double b;
		b=a;
		System.out.println(b);
		
		double c =3.14;
		int d;
		d=(int)c;
		System.out.println(d);
		
		byte bNum = (byte)128; 
		System.out.println(bNum);
		byte bNum1 = (byte)256; 
		System.out.println(bNum1);
		// 0000 0001 0000 0000 -> 256
		// xxxx xxxx 0000 0000 -> 0
		// 0000 0001 0000 0001 -> 257
		// xxxx xxxx 0000 0001 -> 1
		
	}
}
