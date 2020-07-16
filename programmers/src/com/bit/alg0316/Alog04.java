package com.bit.alg0316;


//문자열 내 p와 y의 개수
public class Alog04 {
	static boolean solution(String s) {
		boolean answer = true;
		s = s.toUpperCase();
		
		long pCnt = s.chars().filter(e -> e =='P').count();
		long yCnt = s.chars().filter(e->e=='Y').count();
		System.out.println(pCnt + " : " + yCnt);
		
		answer = s.chars().filter(e -> 'P'==e).count() == s.chars().filter(e->'Y' == e).count();

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
	}
}







