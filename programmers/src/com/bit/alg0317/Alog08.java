package com.bit.alg0317;

import java.util.Arrays;
import java.util.stream.Stream;

//문자열 내 마음대로 정렬하기
// 스트림으로
public class Alog08 {
	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].charAt(n) + strings[i]; // 첫번째에 n번째 문자 추가해서 정렬
		}
		Arrays.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i].substring(1,strings[i].length());
		}
//
//		Stream<String> stream = Arrays.stream(strings);
//		stream.forEach(System.out::println);
//		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		String[] strings = { "sun", "bed", "car" };
		String[] result = solution(strings, 1);
		for(String r : result) {
			System.out.println(r);
		}
	}
}
