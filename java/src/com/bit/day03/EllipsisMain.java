package com.bit.day03;

import java.util.Arrays;

public class EllipsisMain {
	/*
	 * ... : Ellipsis 
	 *  기존 매개변수 선언 방법 (int n1, int n2,int n3 ,...int10)
	 *  - 매개 변수를 여러개 처리할 수 있는 메소드를 만들자니 메소드 정의가 많아진다.
	 *  - 매개변수의 상황에 따라 모든 메소드를 정의?
	 *  
	 *  가변배열형식의 매개변수 선언방법
	 *  (int ... n) -> int[] n : 넣은 인자 개수만큼 자동으로 배열 생성
	 */
	
	
	
	//전달되는 모든 인자를 출력하는 메소드
	public static void intPrint(int... n) { // n ->int[]
		for(int i :n) {
			System.out.print(i + " ");
		}System.out.println("");
	}	
	
	public static void strPrint(String... n) { //n -> string[]
		for(String str : n) {
			System.out.print(str + " ");
		}System.out.println("");
	}

	//public static void print(String... addrs, int id) -> 오류남,  엘립시스는 마지막 인자로 활용
	public static void print(int id, String... addrs) {
		System.out.println("id : " + id);
		System.out.println("addrs : " + Arrays.toString(addrs));
	}
	
	
	public static void main(String[] args) {
		intPrint(1);
		intPrint(1,2);
		intPrint(1,2,3);
		
		strPrint("one");
		strPrint("one","two");
		strPrint("one","two","three");

		System.out.printf("%d\n",10);
		// printf(String format, Object... obj){..}  원형
		
		
		print(1100,"천안","두전동");
	}

}
