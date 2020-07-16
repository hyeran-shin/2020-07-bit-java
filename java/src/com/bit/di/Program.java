package com.bit.di;

public class Program {
	public static void main(String[] args) {
		// 외부 시점
//		Calculator calculator = new CalculatorEN();
		Calculator calculator = new CalculatorKR();
		// Mycalculator는 calculatorKR에 의존한다.
		
		// Dependency Injection (의존성 주입)
		// : 외부에서 생성된 객체를 Constructor, Setter를 통해 설정(주입)!
		
		Mycalculator my = new Mycalculator(calculator);
		my.setN1(7);
		my.setN2(3);
		my.add();
		my.sub();
		my.mul();
		my.div();
		// 영문버전이 바뀌면 mycalu 도 바뀐다 -> 의존
	}
}
