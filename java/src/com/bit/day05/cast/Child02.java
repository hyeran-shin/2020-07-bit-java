package com.bit.day05.cast;

public class Child02 extends Parent{
	public Child02() {
		name = "두 번째 자식";
	}
	void soccer() {
		System.out.println("마이볼!");
	}
	void drink() {
		System.out.println("오늘 고생했어 쨘");
	}
	
	@Override
	void info() {
		System.out.println(name + "에서 재정의 된 info() 메소드 호출됨...");
	}
}
