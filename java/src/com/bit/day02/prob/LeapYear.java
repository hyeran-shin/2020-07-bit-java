package com.bit.day02.prob;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// Q. 입력한 수가 윤년인지 판단하는 프로그램을 작성하세요.
		// 4로 나누어 떨어지지만 100으로 나누어 떨어지는 해는 평년으로 한다.
		// 단, 400으로 나누어 떨어지는 해는 윤년으로 한다

		System.out.println("년도 입력 : ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		if (((year % 4) == 0 & (year % 100) != 0) | (year % 400) == 0) {
			System.out.println(year + "년도는 윤년입니다.");
		}else {
			System.out.println(year + "년도는 윤년이 아닙니다.");
		}

		scan.close();

	}

}
