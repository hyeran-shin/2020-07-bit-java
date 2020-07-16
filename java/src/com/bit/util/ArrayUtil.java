package com.bit.util;

public class ArrayUtil {
	// null
	// - 데이터가 없음을 의미
	// - 비어있다면 null을 반환

	// double[] -> int[]
	// -> 실수형 배열을 전달받아 정수형 배열로 형변환 후 반환

	public static int[] doubleToInt(double[] dArr) {
		if (dArr == null) { // 전달된 배열에 데이터가 없다면
			return null;
		}

		int length = dArr.length; // 동일한 크기의 빈 배열을 생성하기 위해 length 변수 활용
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			result[i] = (int) dArr[i]; // 강제 형변환 후 반환시킬 배열에 저장(대입)
		}

		return result;
	}

	// int[] -> double[]
	public static double[] intToDouble(int[] iArr) {
		if(iArr ==null) return null;
		
		int length = iArr.length;
		double[] result = new double[length];
		
		for(int i = 0 ; i<length;i++) {
			result[i] = iArr[i] ; //자동 형변환
		}
		
		return result;
	}
	
	// 두 배열을 연결시키는 기능(concat)
	//	-> 두 정수형 배열을 전달받아 연결한 결과를 정수형 배열로 반환
	public static int[] concat(int[] a, int[] b) {
		/*
		 * 삼항연산자, 조건연산자
		 * [형태]
		 * (조건식) ? (A구문) : (B구문);
		 * A : 참일 때 수행, B: 거짓일 때 수 행 
		*/

//		int length = -1; // 0이상의 의미있는 변수 성격이라면 -1 초기화
//		if (a == null)
//			length = 0;
//		else
//			length = a.length;

		int aLength = (a == null) ? 0 : a.length;
		int bLength = (b == null) ? 0 : b.length;

		int length = aLength + bLength; // 두 배열의 총 길이
		int[] result = new int[length];
		
		int index = 0; // 두 반복문에서 모두 사용하기 위해 밖에 선언
		
		for(int i = 0 ; i<aLength ; i++) {
			result[index] = a[i];
			index++;
		}
		for(int i =0;i<bLength ; i++) {
			result[index] = b[i];
			index++;
		}
		return result;
		
		
		
		
		
	}
	
	
}











