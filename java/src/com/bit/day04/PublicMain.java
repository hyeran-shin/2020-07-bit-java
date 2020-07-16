package com.bit.day04;

/*
 * 접근 지정자(접근 제한자, 접근 지시자)
 *  : 클래스(class)간의 필드 접근 범위를 설정하는 용도
 *  
 *  public	  : 어디서나 접근 가능 (접근 제한 X)
 *  private   : 클래스 내부에서만 접근 가능
 *  (default) : 동일 패키지 내에서만 접근 가능
 *  			(접근 지정자를 선언하지 않은 경우)
 *  protected : 상속 관계에서 접근 가능
 *  
 *  범위 크기
 *   - private < default < protected < public
*/


class Dog {
	public String name; // public
	int age; // default
	@SuppressWarnings("unused")
	private double weight; // private
	
	
	Dog() {
		// 같은 클래스(dog) 내부이기에 접근 가능
		name = "백구";
		age = 3;
		weight = 7.8;
	}

}

class Cat {
	public String name;
	Dog dog; // 다른 클래스의 인스턴스 변수 선언 및 생성이 가능

	Cat() {
		name = "라떼";
		dog = new Dog(); // Dog 인스턴스 생성
		dog.name = "황구";
		dog.age = 5;
		// dog.weight = 6.4; // private 지정자이기 떄문에 접근 불가

	}

}


// public class는 파일을 대표하는 클래스며 단 하나만 존재할 수 있다.
// public class Panda { } 

// PublicMain.java 파일을 대표하는 PublicMain 클래스
//  -> 대표 클래스는 파일명과 클래스명이 일치한다.
public class PublicMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "흑구" ; 
		dog.age = 2;
		//dog.weight = 5.5; // private 지정자이기 때문에 접근 불가
	}
}
