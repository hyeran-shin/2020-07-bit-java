package com.bit.day02;

import java.util.Scanner;

public class ScannerMain {
	public static void main(String[] args) {
		//자동 import : ctrl + shift + o
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = scan.nextInt();
		System.out.println("정수 : "+num);
		
		scan.nextLine();
		
		System.out.println("문자입력 : ");
		char c = scan.nextLine().charAt(0);
		System.out.println("문자 : "+c);
		
		System.out.println("문자열 입력 : ");
		String str = scan.next();
		//문자열 입력 시 공백 포함하지 않고, 한 단어 기준으로 입력
		System.out.println("문자열 : "+str);

		scan.nextLine();

		System.out.println("문자열 입력 : ");
		String str2 = scan.nextLine();
		//문자열 입력 시 공백 포함하여 입력(문장)
		System.out.println("문자열 : "+str2);
		
	}
}
