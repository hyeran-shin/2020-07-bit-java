package com.bit.di;

public class CalculatorEN implements Calculator {

	@Override
	public void addition(int n1, int n2) {
		System.out.println("Addition : " + (n1 + n2));
	}

	@Override
	public void subtraction(int n1, int n2) {
		System.out.println("Sbutraction : " + (n1 - n2));

	}

	@Override
	public void multiplication(int n1, int n2) {
		System.out.println("Multiplication : " + (n1 * n2));

	}

	@Override
	public void division(int n1, int n2) {
		System.out.println("Division : " + (n1 / n2));

	}

}
