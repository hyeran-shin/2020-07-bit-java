package com.bit.alg0213;
// 가운데 글자 가져오기 

public class alg02 {
	public static String solution(String s) {
		int size = s.length();
		String answer = "";

		if (s.length() % 2 == 0) {
			answer = s.substring(size / 2 - 1, size / 2 + 1);
			return answer;
		} else {

			answer = String.valueOf(s.charAt(size / 2));
			return answer;

		}
	}

	public static void main(String[] args) {
		System.out.println(solution("abcdef"));

	}

}
