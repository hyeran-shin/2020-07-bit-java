package com.bit.alg0212;

// 모의고사
public class alg04 {

	public static void main(String[] args) {

		int[] answers = { 3, 3, 3, 1 }; // 정답 배열
		solution(answers);

	}

	public static int[] solution(int[] answers) {
		int[] answer = {};

		int[] test1 = { 1, 1, 1, 1 }; // 1개 맞음
		int[] test2 = { 2, 2, 3, 1 }; // 2개 맞음
		int[] test3 = { 3, 3, 3, 3 }; // 3개 맞음
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == test1[i]) {
				max1++;
			}
			if (answers[i] == test2[i]) {
				max2++;
			}
			if (answers[i] == test3[i]) {
				max3++;
			}

		}

		int[] maxArr = { max1, max2, max3 };
		// int maxCount = Math.max(max1,max2,max3);
		int[] maxCount = max(maxArr);
		System.out.println(maxCount[0]);

		return answer;
	}

	public static int[] max(int n[]) {
		int max = n[0];
		int[] result = new int[n.length];
		int count = 0; // 몇번쨰?
		for (int i = 1; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
				result[i] = count; // 제일 많이 맞춘애가 몇번쨰 index 있는지?
			}
			count++;
		}
		return result;
	}

}
