package com.bit.alg0317;
//문자열 정수로 바꾸기

public class Alog04 {
	public static int solution(String s) {
		int answer = 0;
		// s의 길이 1 이상 5 이하

//		if (s.length() >= 1 && s.length() <= 5) {
//			if (s.charAt(0) == '+') {
//				s = s.substring(1, s.length());
//				answer = Integer.parseInt(s);
//			}else if (s.charAt(0) == '-') {
//				s = s.substring(1, s.length());
//				answer = Integer.parseInt(s)*-1;
//			}else {
//				answer = Integer.parseInt(s);
//			}
//		}
		answer = Integer.parseInt(s);
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("-1234"));
	}
}
