package com.bit.day05.override;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
//		Cat cat = new Cat();
//		cat.eat(); // 재정의된 메소드 호출
//		
//		Dog dog = new Dog();
//		dog.eat();
//		
//		Animal animal = new Animal();
//		animal.eat();
		
		// 입력받는 기능 또한 분리
		Scanner s = new Scanner(System.in);
		System.out.println("동물 선택하세요.");
		System.out.println("[1]:고양이 [2]:강아지");
		int num = s.nextInt();
		
		// 프로그램 시작하는 영역에서,
		// 입력된 번호에 따른 경우가 눈에 보인다.
//		switch (num) {
//		case 1:
//			Cat cat = new Cat();
//			cat.eat();
//			break;
//		case 2:
//			Dog dog = new Dog();
//			dog.eat();
//			break;
//		}
		
		Menu m = new Menu();
		m.process(num);
		
		s.close();
	}

}
