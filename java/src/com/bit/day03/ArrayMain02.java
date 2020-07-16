package com.bit.day03;

import java.util.Arrays;

public class ArrayMain02 {
	public static void arrInfo(int[] arr) {
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// 배열복사
		int[] org = { 10, 20, 30, 40, 50, };
		int[] cpy = new int[5];

//		arrInfo(org);
//		arrInfo(cpy);
//
//		for (int i = 0; i < org.length; i++) {
//			cpy[i] = org[i];
//		}
//		arrInfo(cpy);
//		
//		System.out.println("----");
//		
		//org 0번지부터의 데이터를 cpy의 0번지부터 org.length 길이만큼복사
//		System.arraycopy(org, 0, cpy, 0, org.length);
//		System.out.println("cpy : " + Arrays.toString(cpy));
		
		//org 3번지부터의 데이터를 cpy의 1번지부터 2개(길이)만큼 복사
		System.arraycopy(org, 3, cpy, 1, 2);
		System.out.println("cpy : " + Arrays.toString(cpy));

		//복사되지 않은 자리는 0으로 되어있다.
		//new를 이용한 배열 생성 시 초기화하지 않으면 자동으로 0으로 초기화
		// -> 최초 cpy 배열은 모두 0이 들어있는 배열

		
		
		
		
	}

}







