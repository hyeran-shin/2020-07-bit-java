package com.bit.alg0316;

//나누어 떨어지는 숫자배열
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alog01 {
	static int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		List<Integer> list = new ArrayList<Integer>(arr.length);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		if (list.size() == 0) {
			list.add(-1);
		}
		Collections.sort(list);
		answer = new int [list.size()];
		for (int i=0;i<list.size();i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 10, 2, 6, 20 };
		int divisor = 10;
		int[] result = solution(arr, divisor);
		for (int r : result) {
			System.out.println(r);
		}

	}
}
