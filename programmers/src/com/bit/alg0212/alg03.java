package com.bit.alg0212;

import java.util.Arrays;
//k번째 수
public class alg03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] c = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] c1 = { 2, 5, 3 };
		int[] c2 = { 4, 4, 1 };
		int[] c3 = { 1, 7, 3 };

		int[][] commands = new int[][] { array, c1 };
		solution(array, commands);
	}

	public static int[] solution(int[] array, int[][] commands) {

		int[] answer = new int[commands.length];

		for (int i = 0; i < commands[0].length; i++) { // array.length
			int[] result = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(result);
			answer[i] = result[commands[i][2] - 1];
		}
		return answer;
	}
	

}
