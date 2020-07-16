package com.bit.day05.cast;

public class Child01 extends Parent {

	public Child01() {
		name = "첫 번째 자식";
	}

	void study() {
		System.out.println("재미있는 탐욕 알고리즘");
	}

	void sleep() {
		System.out.println("자야되는데 자꾸 버그가 생각나...");
	}
	
	@Override
	void info() {
		System.out.println(name + "에서 재정의된 info() 메소드 호출됨...");
	}
}
