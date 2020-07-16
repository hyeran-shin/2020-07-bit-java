package com.bit.day07.generic;

class Banana{
	String size;
	public Banana(String size) {
		this.size = size;
	}
	
	public void info() {
		System.out.println("바나나 크기 : " + size);
	}
}


class Apple{
	int sugar;
	public Apple(int sugar) {
		this.sugar = sugar;
	}
	public void info() {
		System.out.println("당도 : " + sugar);
	}
}

// 객체의 데이터타입에 안전하다.
//  -> 과일 종류별로 모든 클래스를 정의해야한다. - 비용이 많이 든다.
class BananaBox { Banana banana; }
class AppleBox { Apple apple; }

/*
 *  일반적인 타입 약자
 *  T - DataType (U, ...)
 *  K - Key
 *  V - Value
 *  E - Element
 *  N - Numeric, Number
*/

// datatype : 내가 임의로 지은 이름, 스티커를 붙일 수 있는 공간을 표시 
class Box<datatype>{ 
	// 다 담을 수 있지만, 자료형에 안전하지 않다.
//	Object obj; // 원하지 않는 객체가 담길 수 있다.
	
	datatype item; // 박스의 담을 객체(스티커)를 붙여라.  item
	
	public void store(datatype item) { // Setter
		this.item = item;
	}
	public datatype pullOut() { // Getter
		return item;
	}
	
}


public class GenericMain {
	public static void main(String[] args) {
		Box<Banana> bBox = new Box<Banana>();
		bBox.store(new Banana("15"));
//		bBox.store(new Apple(5)); // 컴파일 에러
		Banana banana = bBox.pullOut();
		banana.info();
		
		Box<Apple> a = new Box<Apple>();
		a.store(new Apple(100));
		Apple apple = a.pullOut();
		apple.info();
	}
}







