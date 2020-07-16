package com.bit.alg0317;

public class Alog01 {
	public static String solution(String[] seoul) {
		// 배열 스트림
		// 스트림 : 배열 or 컬렉션 인스턴스 이용
		// 배열 : Arrays.stream 메소드 이용
//		Stream<String> stream = Arrays.stream(seoul);
//
//		stream.filter(s -> s.equals("Kim")).forEach(System.out::println);
		String answer = "";
		int index=-1;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				index = i;
			}
		}
		answer+="김서방은 "+index+"에 있다";
		return answer;
	}

	public static void main(String[] args) {
		String[] str = { "Jane", "Kim" };
		System.out.println(solution(str));
	}
}
