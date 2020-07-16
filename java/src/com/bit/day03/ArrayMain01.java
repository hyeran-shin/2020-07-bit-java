
package com.bit.day03;

import java.util.Arrays;

public class ArrayMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : 동일한 타입의 연관이 있는 데이터들을 묶어서 관리하겠다.

		int[] iArr;
		iArr = new int[3]; // [][][] 생성, 4바이트 * 3 , 인덱스 : 데이터의 위치를 알려주기위해

		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;

		System.out.println("iArr[0] : " + iArr[0]);
		System.out.println("iArr[1] : " + iArr[1]);
		System.out.println("iArr[2] : " + iArr[2]);

		System.out.println("iArr 길이 : " + iArr.length); // 크기 : 용량, 몇바이트
		System.out.println("iArr : " + iArr); // 주소값 : 메모리가 저장되어 있는 실제 위치, 16진수로 표현 , 가장 첫 번째의 주소값 튀어나옴
		// 배열 이름 : 배열의 첫 데이터 주소

		// 배열을 선언함과 동시에 초기화
		int[] iArr2 = { 1, 2, 3 };
		System.out.println("iArr2의 길이 : " + iArr.length);
		System.out.println("iArr2[0] : " + iArr2[0]);
		System.out.println("iArr2[1] : " + iArr2[1]);
		System.out.println("iArr2[2] : " + iArr2[2]);
		// System.out.println("iArr2[3] : " + iArr2[3]);
		// 존재하지 않은 데이터 위치를 출력
		// -> 범위를 넘어서는 위치를 확인하고자 할 때 문제가 발생

//		int[] iArr3;
//		iArr3 = new int[] { 1, 2, 3 }; //new 사용하여 배열 생성 및 초기화
		int[] iArr3 = new int[] { 1, 2, 3 }; // 선언과 동시에 초기화

		// 반복문 활용하여 배열 데이터 모두 출력
		for (int i = 0; i < iArr3.length; i++) {
			System.out.println("iArr3[" + i + "] : " + iArr3[i]);
		}
		System.out.println("");

		// 문자열 3개를 저장할 수 있는 배열 생성
		String[] strArr = new String[3];
		strArr[0] = "Hello";
		strArr[1] = "Array";
		strArr[2] = "World";

		// index의 정수 연산
		int idx = 0;
		System.out.println(strArr[idx++]); // strArr[0]
		System.out.println(strArr[idx++]);
		System.out.println(strArr[idx++]);

		// foreach 반복문
		// 배열의 길이만큼 모두 순회
		for (String str : strArr) {
			// strArr를 0번지부터 순회하는데, 루프마다 str 변수가 해당 데이터를 받는다.
			str = "ooops!";
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("foreach 종료 후 strArray[0] : " + strArr[0]);
		//foreach 반복문은 내부에서 참조의 역할만 가지고 있고 하지만
		//배열의 데이터를 잠시 가지고 있는 것 뿐 실제 배열 데이터 변경과 관련이 없다.
		
		
		//하나의 문자열 형태로 묶어 출력
		System.out.println(Arrays.toString(strArr));
	}

}












