package com.bit.day05;

// java.lang.Object를 import 하지 않아도,
// 상속 관계가 된다?
//	 -> java.lang.* 패키지는 import 없이도 자동으로 포함되어 있다.

class AAA /* extends Object */{ // 예시일 뿐
	// 모든 클래스는 최상위 클래스인 Object를 상속한다.
	@Override
	public String toString() {
		return "AAA Class...";
	}
}

public class ObjectMain {
	public static void main(String[] args) {
		AAA a = new AAA();
		System.out.println(a); // toString() 자동 호출
		System.out.println(a.toString());
		
	}
}

