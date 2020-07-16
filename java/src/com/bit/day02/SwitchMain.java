package com.bit.day02;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("점수 입력 : " );
		int score = s.nextInt()/10;
		
		switch(score){
		case 10 : System.out.println("만점"); 
		case 9 : System.out.println("A"); break;
		case 8 : System.out.println("B"); break;
		case 7 : System.out.println("C"); break;
		case 6 : System.out.println("D"); break;
		default : System.out.println("F");
		}
		
		// 월별 일 수 판단하기
		int month = 1;
		int days = 0;
		if(month ==1 ||
				month ==3 ||
				month ==5 ||
				month ==7 ||
				month ==8 ||
				month ==10 ||
				month ==12 
				) {
			days =31;
		}else if( month ==2) {
			days = 28;
		}else {
			days =30;
		}
		System.out.println(month +"월은 " + days +"일까지 있습니다.");

		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days=31; break;
		case 2: 
			days =28;
		default:
			days=30;
		}
		System.out.println(month+ "월은 " + days +"일까지 있습니다.");
		
		s.close();
	}

}
