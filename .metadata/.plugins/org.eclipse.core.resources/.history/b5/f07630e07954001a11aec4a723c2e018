package com.bit.day04;

class StaticBlock{
	static String name;
	//static String name = "모카떼";
	static { // static block (스태틱 블록, 영역)
		System.out.println("Static Block...");
		name = "모카떼"; //스태틱 변수 초기화
		//내가 원하는 특정 로직에 따라 초기화 시켜주고 싶을때
		System.out.println("name : " + name );
	}
}

class InstanceBlock{
	String name;
	InstanceBlock(){
		System.out.println("InstancBlock() Constructor Called...");
	}
	{ //instacne block
		System.out.println("instance block...");
		name = "오슬로우";
		System.out.println("name : " + name);
	}
}

public class BlockMain {
	public static void main(String[] args) {
		System.out.println("main start...");
		
		// 1. 스태틱 블록 실행
		// 2. 다음의 출력문 수행
		//  -> 클래스 언급 시 스태틱 블록 수행 결과를 확인
		System.out.println(StaticBlock.name);
		
		// 1. 인스턴스 블록 수행
		// 2. 생성자 호출 수행
		@SuppressWarnings("unused")
		InstanceBlock ib = new InstanceBlock();
		
		System.out.println("main end...");
	}
}
