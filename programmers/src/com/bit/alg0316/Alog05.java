package com.bit.alg0316;

import java.util.Arrays;

//문자열 내림차순으로 배치하기
public class Alog05 {

	public static String solution(String s) {
		String answer = "";
		char[] chr = s.toCharArray();
		Arrays.sort(chr);
//	      String strr = new String(chr);
//	      StringBuilder str = new StringBuilder(strr).reverse();
//	      answer = str.toString();
		char[] result = new char[chr.length];
		
		for (int i = 0; i < chr.length; i++) {
			result[i] = chr[chr.length-i-1];
		}
		answer = new String(result);
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefga"));
	}
}