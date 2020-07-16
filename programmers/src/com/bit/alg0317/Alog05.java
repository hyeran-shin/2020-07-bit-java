package com.bit.alg0317;

// 시저 암호화
/*
 * A~Z : 26개 
 * 26으로 나눈 나머지를 
*/
public class Alog05 {
	public static String solution(String s, int n) {
		String answer = "";
		int len = s.length();
		char a;
		char start;
		for (int i = 0; i < len; i++) {
			a = s.charAt(i);
			if (a != ' ') {
				start = Character.isLowerCase(a) ? 'a' : 'A';
				a = (char) (start + (a + n - start) % 26);
			}
			answer += a;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("Bc", 1));
	}
}
