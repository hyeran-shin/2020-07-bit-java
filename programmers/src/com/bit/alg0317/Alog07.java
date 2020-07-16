package com.bit.alg0317;

//이상한 문자 만들기
public class Alog07 {
	public static String solution(String s) {
		String answer = "";
		int index = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				index = 0;
				answer += " ";
				continue;
			} else if (index % 2 == 0) {
				char ch = Character.toUpperCase(s.charAt(i));
				answer += ch;
				index++;
			} else {
				char ch = Character.toLowerCase(s.charAt(i));
				index++;
				answer += ch;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
		solution("try hello world");
	}
}
