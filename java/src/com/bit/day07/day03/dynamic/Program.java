package com.bit.day07.day03.dynamic;
// 제네릭을 활용한 동적배열
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---- Dynamic Array (Generic) ----");
		// Wrapper 클래스인 Integer 스티커를 붙여, 3의 크기 배열을 생성!
		DArray<Integer> darr = new DArray<Integer>(3);
		darr.info();
		darr.add(3);
		darr.info();
		darr.add(5);
		darr.info();
		darr.add(7);
		darr.info();
		darr.add(9);
		darr.info();
		darr.add(11);
		darr.info();
		
		//DArray -> Collection Framework의 ArrayList 흉내
		DArray<String> darr2 = new DArray<String>(3);
		darr2.info();
		darr2.add("one");
		darr2.info();
		darr2.add("two");
		darr2.info();
		darr2.add("three");
		darr2.info();
		darr2.add("four");
		darr2.info();
		darr2.add("five");
		
		DArray<Double> d = new DArray<Double>(3);
		d.add(3.0);
		d.info();
		
		// Q. 메소드 이름 remove, 지우는 메소드 추가 
		
	}

}
