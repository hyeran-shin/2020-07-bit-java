package com.bit.day04.cap;

/*
 * 상속 : 부모-자식간의 형태로 클래스 관계를 주어주는 방법
 * 			-> 단, 유전자를 물려받는 형태의 상속 개념
 * 			  
 * [형태]
 * class [자식 클래스] extends [부모 클래스] { } 
 * 
 * One : 부모 클래스, 상위 클래스, 기반 클래스, *수퍼 클래스
 * Two : 자식 클래스, 하위 클래스, 파생 클래스, *서브 클래스
 * 
 *  -> 서브 클래싱 : 특정 클래스에게 상속을 받게끔 한다.
 *  			 
*/

class StaticParent{
	static int MONEY = 1000;
}
 class StaticChild extends StaticParent{
	StaticChild(){
//		System.out.println(super.MONEY);
		System.out.println(StaticParent.MONEY);
	}
	static void info() {
//		System.out.println(super.MONEY);
		// 부모를 참조하기 위해 super 키워드를 활용하는데,
		// static 메소드 내부는 부모의 생성여부를 모른다.
		System.out.println(StaticParent.MONEY);
	}
}


class One { //부모 클래스
	String bloodType = "A형";
	
//	private int value = 10;// 부모의 private 멤버
	protected int value1 = 10;
	protected int pw = 20; // 부모의 protected 멤버
	
	One(){
		System.out.println("One() 생성자 호출됨...");
	}
}

class Two extends One { //자식 클래스
	String height = "183.8cm";
	// private int pw = 30; // three에서는 접근 불가
	Two(){
		System.out.println("Two() 생성자 호출됨...");
		bloodType = "O형";
		System.out.println(bloodType);
		
		System.out.println("protected value: " + value1);
//		System.out.println(super.value);
		// 부모의 private 멤버 접근 불가
		//  -> getter, setter와 같이 간접 접근을 활용
		System.out.println("password  : " + pw); // one의 protected 멤버 접근
	}
}

class Three extends Two{
	String height = "170cm";
	// 자식 클래스에서 자체 height을 선언했기 때문에
	// 부모의 height 보다 자신의 것을 먼저 바라본다.
	// -> 부모의 height는 가려진다.
	Three(){
		System.out.println("Three() 생성자 호출됨...");
		System.out.println(height);
		System.out.println(pw); // one -> two의 protected 멤버
	}
	Three(String height){
//		this.height = height;
		System.out.println(this.height);
		// 만약, 자식 Three에서 자체 height 선언이 없다면,
		// this.height는 부모의 height를 접근한다.
		System.out.println("super : " + super.height);
		// super : 부모를 의미
	}
}

public class ExtendsMAin {
	public static void main(String[] args) {
//		One o = new One();
//		Two t = new Two();
		// 자식이 존재하기 위해서는 부모가 있어야한다.
		// 즉, 자식을 생성하더라도 부모가 먼저 생성된 후에 자식 생성
		//Three three = new Three();
		// one() -> two() -> three() 생성순서
		
//		Three three = new Three("168.2cm");
		
		@SuppressWarnings("unused")
		StaticChild sc = new StaticChild();
	}

}
