package com.bit.alg0316;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//문자열 다루기 기본
public class Alog06 {
	public static boolean solution(String s) {
		boolean answer = true;

		String pattern = "(^[0-9]*$)";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);

		if ((s.length() >= 1 && s.length() <= 8) && (s.length() == 4 || s.length() == 6)) {
			if (m.find()) {
				answer = true;
			} else {
				answer = false;
			}
		} else {
			answer=false;
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("1234123412asd3"));
	}
}
