package com.bit.day06;

/*
 *  Inner Class
 *   : 클래스 내부에 클래스가 존재하는 형태(내부 클래스)
 *   -> 코드 가독이 힘들다. 주석을 아주 잘 달아놓아야함.
 *   내부클래스는 $로 구분지어서 파일폴더에 저장된다.
 *   
 *  class OuterClass{
 *  	class InnerClass{
 *  
 *  	}
 *  	static class NestedClass {
 *   
 *   	}
 *  }
*/

class Outer {
	Outer() {
		// 클래스 내부에서는 직접 생성 가능!
//		Nested nst = new Nested(); //-> private일때 접근하는 법(?)
//		nst.goo();
		Nested.goo(); // goo() 에 static 추가했을 경우 이렇게 사용
						// static 메소드는 클래스 이름으로 접근
	}

	class Inner {
		public void foo() {
			System.out.println("Inner Class foo() Methond Called...");
		}
	}

	private static class Nested {
		public static void goo() {
			System.out.println("Nested Class goo() Method Called...");
		}
	}
}

public class InnerMain {
	public static void main(String[] args) {
		// 일반 내부 클래스 접근 방법 -> 내부클래스는 한번에 접근 불가
		Outer out = new Outer(); // Outer를 먼저 생성
		Outer.Inner oi = out.new Inner();
		// Outer.Inner : Outer 클래스의 필드(멤버)다. - 접근 연산자
		// -> 내부 클래스 이름 (타입)
		// out.new Inner() : 생성된 Outer를 통해 Inner를 접근하여 생성!
		oi.foo();

		Outer.Inner oi2 = new Outer().new Inner(); // 한줄로 표시 가능
		oi2.foo();

		// static 내부 클래스 접근 방법
//		Outer.Nested on = new Outer.Nested();
//		on.goo();
//		
		
		new Lotto().process();
		// 생성과 동시에 메소드 호출
		// 참조변수로 메소드를 호출할거냐, 생성과 동시에 메소드를 호출할거냐의 차이
		// 생성된 Lotto 객체를 기억하는 참조변수가 존재하지 않는다.
		// 	-> 일회용성, 생성된 객체는 재사용할 수 없다.
		
		// Game 인터페이스를 상속 받는 익명 클래스
		Game g = new Game() { // 원래 인터페이스를 생성 못함, Game g = new Game() 불가
			@Override
			public void process() {
				System.out.println("추첨을 시작합니다. Game");
			}
		};
		g.process();
		
		new Game() {
			@Override
			public void process() {
				System.out.println("추첨을 시작합니다. Game2");
			}
		}.process(); //일회용성
		
		
	}
}

interface Game {
	void process();
}

class Lotto implements Game {

	@Override
	public void process() {
		System.out.println("추첨을 시작합니다.");
	}

}
