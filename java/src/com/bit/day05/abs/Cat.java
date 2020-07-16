package com.bit.day05.abs;

// 추상클래스를 상속받으면 꼭 재정의 해줘야함(오버라이딩=재정의)
abstract class One{
	abstract void foo();
}
abstract class Two extends One{ //Two class도 abstract여서 재정의 필요 없음.
	
}
class Three extends Two{ //구현 클래스, 실체화 클래스
	// 추상 메소드를 상속받는 구현 클래스에서는 꼭 재정의!
	
	@Override
	void foo() {
		System.out.println("foo()...");
	}
	
}


public class Cat extends Animal { //animal 클래스를 서브클래싱 해준다. 
	// 부모 클래스의 추상 메소드는 자식에서 무조건 재정의를 해야한다.
	
	@Override // 해당 메소드가 오버라이드 된 것임을 표시
	public void eat() {
		System.out.println("고양이 냥냥냥");
	}
	
}
