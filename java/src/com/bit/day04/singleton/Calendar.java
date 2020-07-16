package com.bit.day04.singleton;

/*
 *  싱글톤 패턴(단일체 패턴, Singleton Pattern)
 *   : 객체를 단 하나만 생성(사용)하고 싶을 때
*/
public class Calendar {
	String name;

	// 외부 접근이 불가능하도록 private 지정
	private static Calendar obj;
	
	//확정된 인스턴스 갖도록 상수화, 선언과 동시에 초기화
//	private final static Calendar obj = new Calendar(); // 같은 싱글톤 패턴
	
	// 외부에서 생성자를 호출하지 못하도록 막겠다. private
	private Calendar() {}

	// getter
	public static Calendar getInstance() {
		if (obj == null) { // obj가 Calendar를 담고 있지 않다면,
			obj = new Calendar(); // Calendar를 생성하여 담아라.
		}
		return obj; // obj 반환
	}
}
