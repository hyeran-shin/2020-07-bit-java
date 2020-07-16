package com.bit.day02;

public class MethodMain02 {

	/*
	 * 재귀 메소드 - 메소드 자신 내부에서 자신을 다시 호출하는 형태 - 메소드도 메모리를 사용한다. - StackOverflow error
	 */
	public static void foo() {
		System.out.println("foo() Method called..");
		foo();
	}

	// factorial
	public static int factorial(int n) {

		if (n == 1) {// 탈출 조건
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		// foo();
		System.out.println("5! = "+factorial(5));
		System.out.println("8! = "+factorial(8));
	}

}
