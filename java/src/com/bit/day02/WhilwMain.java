package com.bit.day02;

public class WhilwMain {
	public static void main(String[] args) {
		int cnt = 0;
		while (cnt < 10) {
			System.out.println(cnt + "");
			cnt++;
		}
		System.out.println("");

		int num = 0;
		while (num < 0) {
			System.out.println("while");
			num++;
		}
		num = 0;
		do {
			System.out.println("do~while");
			num++;
		} while (num < 0);
		System.out.println(num);
	}
}
