package com.bit.day06.except;

// 사용자 정의 예외 클래스
@SuppressWarnings("serial")
public class OddException extends Exception{
	public OddException() {
		super();
	}
	
	public OddException(String msg) {
		super(msg); // "\ by zero" 처럼 예외 메시지를 출력하겠다.
	}
}

