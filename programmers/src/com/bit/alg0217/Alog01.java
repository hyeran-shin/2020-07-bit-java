package com.bit.alg0217;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 문자열 다루기 기본
public class Alog01 {

	static boolean solution(String s) {
		boolean answer = true;
//		Double.parseDouble(s); //실수변환 가능한지(실수 = 정수도포함)
		String pattern = "(^[0-9]*$)";
		Pattern p =Pattern.compile(pattern);
		Matcher m = p.matcher(s);
		System.out.println("dd" + m);
		
		if (s.length() == 4 || s.length() == 6) {
			Integer.parseInt(s); 
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}

	public static void main(String[] args) {
		String s = "a234";
		solution(s);

	}
}
