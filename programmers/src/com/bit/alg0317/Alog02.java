package com.bit.alg0317;
//소수 찾기

public class Alog02 {
	public static int solution(int n) {
		int answer = 0;
		int cnt = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					cnt++;
				}
				if (cnt >= 2) {
					break;
				}
			}
			if (cnt < 2) {
				answer++;
			}
		}
		System.out.println("cnt" + cnt);
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(10));
	}
}
