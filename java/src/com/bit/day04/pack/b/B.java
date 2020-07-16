package com.bit.day04.pack.b;

import com.bit.day04.pack.a.TestData;

// TestData와 다른 패키지이지만 상속 관계인 B 클래스
public class B extends TestData{
	TestData td = new TestData();
	// 다른 패키지 -> 디렉토리 경로가 다른 곳에 있는 클래스
	// 사용하기 위해서 import 해야함
	
	// B 가 물려 받음
	B b = new B();
	
	B () {
		System.out.println(td.name); // public
		//System.out.println(td.id);   // protected
		System.out.println(b.id);
		// protected로 접근 가능한 멤버는
		// 상속을 주는 TestData가 아니라
		// 상속을 받는 B가 활용
		//    -> 다른  패키지라도 상속 관계라면 접근가능
		
		
//		System.out.println(td.addr); // default
//		System.out.println(td.money);// private
	}
}






