package com.bit.day04.singleton;

public class Program {
	public static void main(String[] args) {
//		Calendar c; // public class 참조변수 선언 가능
//		c=new Calendar() // private constructor, 생성자 호출 불가능
		
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		System.out.println("calendar 1 : " + c);
		System.out.println("calendar 2 : " + c2);
	}
}


