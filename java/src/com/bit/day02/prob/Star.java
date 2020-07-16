package com.bit.day02.prob;

public class Star {
	public static void main(String[] args) {
		/*
		 * Q. 다음 각 그림처럼 별을 출력하세요
		 * 
		 * ***** * ***** * ********* **** ** **** *** ******* *** *** *** ***** ***** **
		 * **** ** ******* *** * ***** * ********* *
		 * 
		 * 
		 * * * * * * * * * * * * * * * ********* *
		 * 
		 * 
		 */

		System.out.println("1 START");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		/////////////////////////

		System.out.println("2 START");
		for (int i = 0; i < 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		
		//////////////////////////
		System.out.println("3 START");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j < 6 - i - 1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println("");
		}

		//////////
		System.out.println("4 START");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j < 6 - i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

		//////////
		System.out.println("5 START");
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//////////
		System.out.println("6 START");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 9; k >= i * 2 + 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//////////
		
		System.out.println("7 START");
		int num=5;
		
		for (int i=0;i<num;i++){
			  for (int j=0; j<num;j++)
			  {
			     if (i<=num/2)// 위쪽 영역
			     {
			        if (i+j<=num/2-1)// 왼쪽 위 공백찍기
			           System.out.print(" ");
			        else if (j-i>=num/2+1) // 오른쪽 위 공백찍기
			        	System.out.print(" ");
			        else
			           System.out.print("*");// *찍기
			     }
			     else if (i>num/2) //아래쪽 영역
			     {
			        if (i-j>=num/2+1) //왼쪽 밑 공백
			        	System.out.print(" ");
			        else if (i+j>=num/2*3+1)//오른쪽 밑 공백
			        	System.out.print(" ");
			        else
			        	System.out.print("*"); // *찍기
			     }
			  }
			  System.out.println();//줄바꿈
			}
		
		////////
		System.out.println("8 START");
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
