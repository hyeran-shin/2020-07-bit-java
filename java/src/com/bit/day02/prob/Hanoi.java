package com.bit.day02.prob;

import java.util.Scanner;

public class Hanoi {
	
	int count = 0;

	public static void main(String[] args) {
		// Q. 하노이 타워의 이동 기록와 총 이동 횟수를 출력하세요.
		// 4개의 원판 움직이기 위해서는 2의 3ㅛ,ㅡ?

		System.out.println("하노이 타워 이동 횟수 입력 : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Hanoi hanoi = new Hanoi();
		
		hanoi.move("1","2","3",n);
		hanoi.showResult();
		
		scan.close();
	}	
	
	public void move(String first, String center, String last, int n) {
		// (탑, 보조탑, 옮ㄱ)
		if(n==1) {
			++count;
			System.out.println(n + "번 탑 : " +first+"번째 기둥에서 "+last+"번째 기둥으로");
		}else {
			move(first,last,center,n-1);  //마지막탑을 보조탑으로 이용하여 첫번째탑에 있는 n-1개의 원반들을 중간에 있는 탐으로 이동한다. 
			++count;
			System.out.println(n + "번 탑 : " +first+"번째 기둥에서 "+last+"번째 기둥으로");
			move(center,first,last,n-1);  
			//첫번째탑을 보조탑으로 이용하여 중간탑에 있는 n-1개의 원반들을 목적지 탑으로 이동
		}
			
	}
	public void showResult() {
		System.out.println("총 움직인 횟수 : " + count);
	}	
	
}
