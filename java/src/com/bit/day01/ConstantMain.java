package com.bit.day01;

public class ConstantMain {
	public static void main(String[] args) {
		final int CONST_NUMBER=10;
		//final : 상수화 키워드, 변하지 못하도록 막겠다.(최종으로 확정해라)
	    System.out.println(CONST_NUMBER);
		int num =10;
		num = 20;
		System.out.println(num);
	}
}
