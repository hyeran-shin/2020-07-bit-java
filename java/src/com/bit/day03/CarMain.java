package com.bit.day03;

// class : 객체를 생성하기 위한 설계도 (틀)
class Car {
	// 필드 선언 및 정의
	// 멤버 변수(데이터)
	String name;
	int speed;

	// 멤버 메소드(기능, 행위)
	void drive() {
		System.out.println("부아앙~");
	}
	
	void info() {
		System.out.println("name : " + name + " speed : " + speed);
	}
	
}

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car(); // 인스턴스 생성
		// 인스턴스와 객체는 다른 개념이지만, 편의를 위해 객체 생성

		car.name = "BMW";
		car.speed = 330;
		car.drive();
		System.out.println("name : " + car.name + " speed : " + car.speed);

		Car car2; // 해당 타입의 객체를 담을 수 있는 변수 , 참조 변수 , 
		car2 = new Car(); // 자동차를 생성하여 car2 변수에 담아라
		
		System.out.println(car);//참조변수는 기본적으로 주소정보를 출력
		System.out.println(car2);//참조변수는 기본적으로 주소정보를 출력
		// . : 멤버 연산자, 접근 연산자
		car2.name = "Benz";
		car2.speed = 330;
		car2.drive();
		
		System.out.println("name : " + car2.name + " speed : " + car2.speed);
		
		
		car.info();
		car2.info();
	}
}
