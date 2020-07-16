package com.bit.day02.prob;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// Q. 입력한 두 단수 사이의 구구단을 출력.
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 단수 입력 : ");
		int x = scan.nextInt();
		System.out.println("두번째 단수 입력 : ");
		int y = scan.nextInt();

		while (x <= y) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(x + " * " + j + " = " + x * j);
			}
			System.out.println();
			x++;
		}

		scan.close();
	}
}
