package com.bit.day07.day03.dynamic;

import java.util.Arrays;

public class IntDArray { // dynamic 동적배열 (자동으로 크기가 늘어나는)

	int[] buffer; // 배열의 저장소
	int capacity; // 저장소의 크기(길이)
	int usage; // 보관 개수

	public IntDArray(int capacity) {
		this.capacity = capacity;
		buffer = new int[capacity];
		usage = 0;
	}

	public boolean isFull() {
		return capacity == usage;
		// 저장소 크기와 보관개수가 같다면, 꽉 찼다면 true 반환
		// 아니라면 false
	}

	public boolean add(int value) {
		/* Q. 동적 배열 만들기
		 *  다음코드는 데이터가 꽉 찼을 때 더 이상 추가하지 않는다. (false 반환)
		 *  수정을 통해, 데이터가 꽉 차 있는 상태라도 데이터가 들어갈 수 있도록
		 *  동적으로 저장 공간을 늘리는 동적 배열을 만드세요.
		*/
		if (isFull()/* ==true */) { // isFull()의 결과는 boolean
			// return false; // 저장 실패
			
			buffer = Arrays.copyOf(buffer, buffer.length+10);
			//buffer = new int[buffer.length+10];
			
		}
		buffer[usage] = value;
		usage++;
		return true; // 저장 성공
	}

	// 배열 정보 출력
	public void arrInfo() {
		// 문자열 관련 메소드
		// - format(...) : printf와 같이 문서양식에 맞게 데이터 매칭 후 문자열로 반환
//					-> printf는 문자열로 화면에 출력
//					-> format은 문자열로 반환만

		String str = String.format("저장소의 크기 : %d 보관 개수 : %d", capacity, usage);
		System.out.println(str);
		for (int i = 0; i < usage; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println();

	}

}
