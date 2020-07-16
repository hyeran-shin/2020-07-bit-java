package com.bit.day05.abs;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Animal ani;
//		ani = new Animal(); // 객체 생성 불가능

		
		Scanner s = new Scanner(System.in);
		System.out.println("동물 선택하세요.");
		System.out.println("[1]:고양이 [2]:강아지");
		int num = s.nextInt();
		
		Menu m = new Menu();
		m.process(num);
		
		s.close();
	}

}
