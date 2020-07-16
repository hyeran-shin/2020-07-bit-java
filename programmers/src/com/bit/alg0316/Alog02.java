package com.bit.alg0316;

// 두 정수 사이의 합

class Solution {
	public static long solution(int a, int b) {
		long answer = 0;
		if (a >= b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		}
		return answer;
	}
}

public class Alog02 {
	public static void main(String[] args) {
		long result = Solution.solution(5, 3);
		System.out.println(result);
	}

}
