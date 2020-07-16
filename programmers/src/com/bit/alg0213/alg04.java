package com.bit.alg0213;

import java.util.*;

// 같은 숫자는 싫어
class Solution {
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length];
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp = 10;

		for (int num : arr) {
			if (temp != num) {
				list.add(num); 
			}
			temp = num;
		}
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.print( (Integer)list.get(i) + " ");
			answer[i] = (Integer)list.get(i);
		}
		return answer;
	}
}

public class alg04 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 3, 0, 1, 1 };
		Solution s = new Solution();
		s.solution(arr);
	}
}
