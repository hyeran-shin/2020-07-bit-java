package com.bit.day03;

public class ArrayMain03 {

	public static void main(String[] args) {
		// 1차원 배열 : [가로]
		// 2차원 배열 : [세로][가로]
		// 3차원 배열 : [높이][세로][가로]
		//	 -> 생성 시 크기와 접글할 인덱스 순서
		
		// 1차원 배열 int[] 들을 담을 수 있는 배열을 만들겠다.
		int [][] iArr = new int[2][3]; 
		/*
		 * 2차원 배열은 면의 형태로 생성
		 * [] [] []
		 * [] [] [] 
		*/
		iArr[0][0] = 10;
		iArr[0][1] = 20;
		iArr[0][2] = 30;
		iArr[1][0] = 40;
		iArr[1][1] = 50;
		iArr[1][2] = 60;
		
		/*
		 * 10 20 30
		 * 40 50 60 
		*/
		System.out.println(iArr[0].length);
		for (int i = 0; i < iArr.length; i++) { // 세로 순회
			for(int j = 0 ; j < iArr[i].length ; j++) { // 가로 순회
				System.out.printf("iArr[%d][%d] : %d ", i,j,iArr[i][j]);
			}
		}
		System.out.println();
		
		
		
		//2차원 배열의 첫 줄( 1차원 배열)
		iArr[0] = new int [3]; // 3 길이의 빈 배열로 대입
		iArr[1] = new int [2]; // 2 길이의 빈 배열로 대입
		/*
		 * [] [] []
		 * [] [] 
		*/
		for (int i = 0; i < iArr.length; i++) {
			for (int n : iArr[i]) {
				System.out.print(n + " ");
			}
			System.out.println("");
		}

		for (int[] arr : iArr) { // 2차원 배열 순회
			for (int n : arr) { // 1차원 배열 순회
				System.out.print(n + " ");
			}
			System.out.println("");
		}

		/*
		 * Q. 다음 그림과 같이 2차원 배열 생성과 초기화 후, 모두 출력 
		 * [실행 결과]
		 * 1   2   3  4 
		 * 8   7   6  5
		 * 9  10  11  12
		 * 16 15  14  13
		 */
		
		int[][] array = new int[5][5];
		int index = 1;
		int row, col;

		for (row = 0; row < array.length; row++) {
			if (row % 2 == 0) {
				for (col = 0; col < array[row].length; col++) {
					array[row][col] = index++;
				}
			} else {
				for (col = 0; col < array[row].length; col++) {
					array[row][array[row].length - 1 - col] = index++;
				}
			}
		}
		
		for(int[] n : array) {
			for(int i : n) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
