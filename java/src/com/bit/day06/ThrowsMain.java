package com.bit.day06;

import java.io.FileReader;

public class ThrowsMain {
	// throws : 나를 호출한 곳으로 예외 처리를 넘겨라!
	static void foo() throws Exception{
		@SuppressWarnings({"unused","resource"})
		FileReader fr = new FileReader("a.txt");
	}
	static void goo() throws Exception{
		foo();
	}
	public static void main(String[] args) throws Exception {
		System.out.println("main start...");
//		foo(); // cheked exception이 포함된 foo() 호출
		
//		try { foo(); } catch (Exception e) { }
//		goo(); // 예외처리 필요 
		//try catch 안하면 프로그램 종료로 main end가 출력이 안됨
		try {
			goo();
		} catch (Exception e) {
			System.out.println(e.getMessage()); //예외 메시지만 확인!
			e.printStackTrace();
			// 예외의 전달 프름을 보여주는 메소드(호출 관계)
			// 예외 발생시, 예외 발생의 흐름을 추적하라
		}
		System.out.println("main end...");
	}
}
