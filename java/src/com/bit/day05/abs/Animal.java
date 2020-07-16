package com.bit.day05.abs;
/*
 * Override 예제에서 보았듯이,
 * Animal의 eat() 메소드의 출력문은 불필요하다. -> 어차피 사용하지 않을 것
 * 설계의 용도로 부모 클래스를 두었기에 부모는 실질적인 기능은 필요하지 않고, 
 * 접근 가능하도록 eat() 메소드의 원형만 기억(선언만)
 * 또한, Animal class는 생성하지 않는다.
 * 
 * abstract class (추상 클래스)
 * 		- 실체를 가지지 않는 클래스, 생성하지 않을 클래스
 * 		- 하나 이상의 메소드가 abstract 하다면,
 * 		    클래스도 abstract 해야한다.
 * 	
*/
public abstract class Animal { // 추상 클래스
	public abstract void eat(); // 추상 메소드  
	//참조 변수로 접근가능하게 원형(선언)만 유지
	// -> 수행 실행 구문(Body, { })을 가지지 않는다.
	
//	public void cry() {} // 활용 가능
	
}
