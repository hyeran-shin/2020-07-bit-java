package com.bit.alg0213;

// 2016년
public class alg03 {
	public static String solution(int a, int b) { // 월, 일
		// 2016년 1월 1일 : 금
		int[] day = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] w = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int sum = 0;
		
		
		for (int i = 0; i < a - 1; i++) {
			sum += day[i];
		}
		sum += b-1;
		
		String answer = w[sum % 7];
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(1, 1));
	}
}
