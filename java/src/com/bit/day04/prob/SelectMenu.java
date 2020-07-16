package com.bit.day04.prob;

public class SelectMenu {

	private int key;
	
	int getKey() {
		return key;
	}
	
	int setKey(int key) {
		
		switch(key){
		case 1: System.out.println("[추가]"); return 0; 
		case 2: System.out.println("[삭제]"); return 0;
		case 3: System.out.println("[검색]"); return 0;
		case 4: System.out.println("[수정]"); return 0;
		default : System.out.println("[종료]"); this.key =key;return 1;			
		}
		
	}
}
