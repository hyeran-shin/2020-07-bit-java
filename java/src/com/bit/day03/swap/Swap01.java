package com.bit.day03.swap;

public class Swap01 {
	/*
	 * Call By Value : 값에 의한 호출 
	 *  - 단순히 값만 받아오기에, 
	*/
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 3;
		System.out.println("a : " + a + ", b : " + b);
//
//		int temp = a;
//		a = b;
//		b = temp;
		
		swap(a,b);
		System.out.println("a : " + a + ", b : " + b);

	}

}
