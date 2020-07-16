package com.bit.day06;

import java.util.StringTokenizer;

public class StringMain {
	public static void main(String[] args) {
		// startsWith()
		String str = "Sing.mp3";
		String sub = "Si";
//		String sub = "si"; // 대소문자 구분
		boolean bool = str.startsWith(sub);

		if (bool) {
			System.out.println(sub + "로 시작합니다.");
		} else {
			System.out.println(sub + " 로 시작하지 않습니다.");
		}

//		str = ".pdf";
		sub = ".pdf";
		bool = str.endsWith(sub);
		if (bool) {
			System.out.println("PDF 파일입니다.");
		} else {
			System.out.println("PDF 파일이 아닙니다.");
		}

		String[] strArr = { "정우성", "강동원", "현빈", "손예진", "강호동" };
		for (String s : strArr) {
			if (s.equals("현빈")) {
				System.out.println("풀 네임이 현빈인 사람 : " + s);
			}
		}

		for (String s : strArr) {
			if (s.startsWith("강"))
				System.out.println("성이 강씨인 사람 : " + s);
		}

		for (String s : strArr) {
			if (s.endsWith("예진"))
				System.out.println("이름이 예진인 사람 : " + s);
		}

		str = "Hello World";
		// indexOf() : 해당 문자(문자열)의 위치(index)를 반환
		//  -> 처음부터! 앞에서부터
		// lsatIndexOf()
		//  -> 마지막부터! 뒤에서부터
		int idx = str.indexOf('l');
		System.out.println("l 문자의 위치 : " + idx);

		idx = str.indexOf("World");
		System.out.println("World 문자열의 위치 : " + idx);

		// 'l'의 위치를 모두 찾고 싶을 때 -> api 확인
		char c = 'l';
		idx = str.indexOf(c); // 초기값 2
		while (idx != -1) { // 조건식
			System.out.println(c + "의 위치 : " + idx); // 실행 구문
			idx = str.indexOf(c, idx + 1); // 증감식
			// 찾고자 하는 위치를 강제로 하나 증가
			// [인자1] : 찾고자 할 문자(문자열)
			// [인자2] : 찾을 위치, 시작 위치
		}
		
		idx = -1;
		while((idx=str.indexOf(c, idx + 1)) != -1)
			System.out.println(c + "의 위치 : " + idx + " while()");

		str = "Hello Java Program";
		String result = str.substring(3,str.length());
		// [인자1] : 시작위치(index)
		// [인자2] : 끝 위치 (length-1)
		System.out.println(str +"의 길이 : " + str.length());
		System.out.println(result +"의 길이 : " + result.length());
		//length() : 문자열의 길이 반환
		
		result = str.substring(3,10);
		System.out.println(str +"의 길이 : " + str.length());
		System.out.println(result +"의 길이 : " + result.length());
		
		//replace() : 문자열 대체 
		result = str.replace('a','o');
		System.out.println("str : " + str);
		System.out.println("result : " + result);
		
		// trim() : 불필요한 양쪽 공백을 제거 
		// 필요없는 쓰레기를 제거하는 것을 의미 
		str = "      Hello World        ";
		result = str.trim();
		System.out.println("trim() 전 : " + str);
		System.out.println("trim() 후 : " + result);
		
		str ="정우성:강동원:현빈:손예진";
		// split
		//   : 구분자(Token)를 기준으로 문자열을 분리하여 배열로 반환
		//		-> 특정 문자(문자열) 혹은 정규 표현식(Redex)
		String[] sArr = str.split(":");
		System.out.println("str : " + str);
		for (String s : sArr)
			System.out.print(s + " ");
		System.out.println("");
		// Q. Java API 문서를 통해 Tokenizer 클래스를 활용하여 위 기능을 만들어보세요.
		// pdf에도 tokenizer 있음.
		
		 StringTokenizer st = new StringTokenizer(str,":");
	     while (st.hasMoreTokens()) {
	         System.out.print(st.nextToken()+" ");
	     }System.out.println("");
	}
}












