package com.bit.day02.prob;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// Q. 입력한 수가 소수인지 판단하는 프로그램을 작성하세요.
		// 나누어지는 수가 1과 자기자신

		System.out.println("숫자를 입력 : ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		boolean result = false;

		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				result = true;
				break;
			}
		}

		if (result) {
			System.out.println(x + ": 소수 아님");
		} else {
			System.out.println(x + ": 소수");
		}

		scan.close();
	}
}
