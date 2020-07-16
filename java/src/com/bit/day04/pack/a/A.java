package com.bit.day04.pack.a;

// TestData와 동일패키지에 있는 A클래스
public class A {
	TestData td = new TestData();

	A() {
		System.out.println(td.name);
		System.out.println(td.id);
		System.out.println(td.addr);
//		System.out.println(td.money);
		// 동일 패키지지만, private이기 때문에 접근불가
	}
}
