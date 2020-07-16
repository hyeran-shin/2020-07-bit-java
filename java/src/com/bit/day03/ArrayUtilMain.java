package com.bit.day03;

import java.util.Arrays;

import com.bit.util.ArrayUtil;

public class ArrayUtilMain {
	public static void main(String[] args) {
		// int 배열을 double 배열로 변환
		int[] iArr = { 10, 20, 30, 40, 50 };
		double[] dArr = ArrayUtil.intToDouble(iArr);

		System.out.println(Arrays.toString(dArr));
		//double 배열을 int 배열로 변환
		System.out.println(Arrays.toString(ArrayUtil.doubleToInt(dArr)));
		
		
		//int 배열 두개를 연결한 새로운 배열 반환
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		int[] result = ArrayUtil.concat(a, b);
		System.out.println(Arrays.toString(result));
	}
}
