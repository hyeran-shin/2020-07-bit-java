package com.bit.day02.prob;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int key = 0;
		
		do {
			System.out.println("[1]:추가 [2]:삭제 [3]:검색 [4]:수정 [5]:종료");
			
			key = s.nextInt();
			switch(key){
			case 1: System.out.println("[추가]"); break;
			case 2: System.out.println("[삭제]"); break;
			case 3: System.out.println("[검색]"); break;
			case 4: System.out.println("[수정]"); break;
			default : System.out.println("[종료]"); key=0; break;			
			}
		}while(key !=0);
		
		System.out.println("프로그램 종료");
		s.close();
	}
}
