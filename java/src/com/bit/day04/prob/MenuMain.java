package com.bit.day04.prob;

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int key = 0;
		Scanner s = new Scanner(System.in);
		SelectMenu menu = new SelectMenu();

		
		while(menu.getKey()==0) {
			System.out.println("[1]:추가 [2]:삭제 [3]:검색 [4]:수정 [5]:종료");
			key = s.nextInt();
			menu.setKey(key);
			menu.getKey();
		}
		s.close();

	}

}
