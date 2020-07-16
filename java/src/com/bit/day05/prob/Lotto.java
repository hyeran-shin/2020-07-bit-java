package com.bit.day05.prob;

import java.util.Arrays;
import java.util.Random;

// 연금복권?
// 긁겠습니까? y -> 랜덤으로 숫자들하되, 확률을 낮추는?
// 로또 . 
// 뽑혔다면 다시 뽑아라 , 방식 말고 다른걸로  6개 뽑는 것, 조건문 반복문 배열만 사용

public class Lotto {
	public static void main(String[] args) {

		int[] array = new int[6];

		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			int num = r.nextInt(45) + 1;
			array[i] = num;

			for (int j = i - 1; j >= 0; j--) {
				if (array[i] == array[j]) {
					System.out.println("중복");
					i--;
					break;
				}
			}
		}
		Arrays.sort(array);
		for (int i : array) {
			System.out.println(i);
		}

	}

}
