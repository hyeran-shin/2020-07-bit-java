package com.bit.alg0316;

import java.util.Arrays;

//문자열 내 마음대로 정렬하기
public class Alog03 {
	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		// n번째 요소 뽑은 후 오름차순 정렬,
		// 뽑은 문자열 같으면 사전순으로 정렬
		//compareTo
		char[] cArr = new char[strings.length];
		for (int i = 0; i < strings.length; i++) {
			char chr = strings[i].charAt(n);
			cArr[i] = chr;
			String[] str = {"sd","sd","re"};
			System.out.println(str.length);
		}
		Arrays.sort(cArr);
		
		return answer;
	}

	public static void main(String[] args) {
		String[] strings = { "sun", "bed", "car" };
		String[] result = solution(strings, 1);

		System.out.println(result.toString());
	}
}
