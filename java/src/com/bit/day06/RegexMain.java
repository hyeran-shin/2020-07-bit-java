package com.bit.day06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  정규 표현식(Regular Expression) -> regex
 *  	- 문자열을 원하는 패턴으로 처리하는 방법
 *  	- 문자열 입력에서 원하는 데이터 방식으로 제한
 *  
 *  ^	: 패턴 시작
 *  $	: 패턴 끝
 *  []	: 문자열 종류 및 범위 제한
 *  	[a-z] : 소문자 a부터 z까지
 *  	[A-Z] : 대문자 A부터 Z까지
 *  	[0-9] : 숫자 0부터 9까지
 *  () 	: 내부의 문자를 하나의 문자로
 *  {}	: 개수 및 범위를 표현
 *  
 *  *	: 적용되는 문자의 길이 0~무한으로 받게끔 제한을 두지 x
*/

public class RegexMain {
	public static void main(String[] args) {
		String pattern = "^[a-z A-Z]*$";
		String str = "abcdEFGHijk";
		
		if(Pattern.matches(pattern,str)) 
			System.out.println("패턴 일치");
		else
			System.out.println("패턴 불일치");
		
		
		Pattern p = Pattern.compile("(^[0-9]*$)");
		Scanner s = new Scanner(System.in);
		System.out.print("입력 : ");
		String sVal = s.nextLine();
		
		
		Matcher m = p.matcher(sVal); // 패턴과 문자열이 일치하는지
		if(m.find()) { // 찾았다면, 일치한다면, 
			int num = Integer.parseInt(sVal);
 			// Integer : WrapperClass
			// ParseInt(...) : 정수형으로 파싱(변환)
			System.out.println("입력하신 " + num+ "은 숫자 데이터 입니다.");
		}else 
			System.out.println("입력하신 " + sVal+ "은 숫자 데이터가 아닙니다.");
		
		/*
		 * 정규 표현식의 필수 요소
		 * 1. 시작과 끝
		 * 2. 표현 종류
		 * 3. 표현 범위
		*/
		// 전화번호를 입력 받는 패턴
		p = Pattern.compile("^[0-9]{3}-[0-9]{4}-[0-9]{4}$");
		System.out.print("입력 : ");
		String pNum = s.nextLine();
		
		Matcher mc = p.matcher(pNum);
		if(mc.find())
			System.out.println("일치 합니다.");
		else 
			System.out.println("불일치 합니다.");
		s.close();
		/*
		 * 
		 * Escape Sequence : \
		 * 		기존에 문자를 나타낸다면 정해진 기능을 갖게끔, 
		 * 		기존에 기능을 가진다면, 그냥 문자로 표현하게끔!
		 *
		 * \" : " 문자
		 * \' : ' 문자
		 * \n : 개행 문자
		 * \t : 탭 문자
		*/
		// 이메일 
		// yesjun@morpheous3d.com
		pattern = "^\\w*@\\w*\\.$"; // . : 모든 문자와 일치
//		String test ="\\w"; 
		// \w -> 자바 문자열 특수문자로 제공하지 않음 (컴파일 에러)
		// \\w -> 자바 문자열이 아닌 정규 표현으로 사용하겠다.
		String input = "sdfsd@naer.com";
		if(Pattern.matches(pattern, input)){
			System.out.println("일치");
		}else System.out.println("불일치");
		
		
		//핸드폰 번호
		// | : or 연산자
		pattern = "^01(?:0|1|[6-9])-\\d{4}-\\d{4}$"; //010,011,016,017..,019 
		input = "010-1234-5678";
		if(Pattern.matches(pattern, input))
			System.out.println("핸드폰 번호 패턴과 일치합니다.");
		else 
			System.out.println("핸드폰 번호 불일치합니다.");
		
		
		// 주민번호
		pattern = "^\\{6}-[1-4]\\d{6}$";
		input = "123456-1234567";
		if(Pattern.matches(pattern, input))System.out.println("주민번호 패턴과 일치합니다.");
		else System.out.println("주민번호 패턴과 불일치합니다.");
		
		//ip 주소
		// {3} : 3자리수
		// {1,3} : 1자리~3자리 모두
		pattern = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$";
		input = "192.168.1.2";
		if(Pattern.matches(pattern, input))
			System.out.println("ip 양식과 일치합니다.");
		else System.out.println("ip 양식과 불일치합니다.");
		
		// 파일 확장자
		// + : 구분자로 활용, \S . 문자까지 인식
		// (?i) : 대소문자 무시
		pattern = "^\\S+.(?i)(pdf|hwp|doc|java|ppt)$"; //\\S. 하게되면 앞에 다 무시됨
		input = "R.java";
		if(Pattern.matches(pattern, input))
			System.out.println("사용가능한 확장자입니다.");
		else
			System.out.println("사용 불가능한 확장자입니다.");
		
		
	}
}











