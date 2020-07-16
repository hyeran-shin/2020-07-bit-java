package com.bit.day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OOME { // OutOfMemoryError
	public static void main(String[] args) {
		// Memory Leak (메모리 누수)
		// : 필요하지 않은 메모리를 사용하는 상태, 점유하는 상태
		// -> OutOfMemoryError : GC Overhead limit exceeded //OOME가 GC 오버해드로 이어질수도 있음?
//		Random random = new Random();
//		Map<Integer, String> map = new HashMap<>();
//		while(true) {
//			int rValue = random.nextInt();
//			map.put(rValue, String.valueOf(rValue));
//		}
//	

		// OutOfMemoryError: Requested array size exceeds VM limit , 배열의 크기를 넘어섰ㅅ을때
		// : 힙 메모리 공간 보다 큰 배열을 할당하려 할 때 발생
//		int[] arr = new int[Integer.MAX_VALUE];

		// OutOfMemmoryError : Java heep space, 영역 관련 에러
		// : 더 이상 객체를 생성할 수 없는 경우 발생
		// 해결방안
		// 1. 메모리 크기 확인 (증강) ex) 이클립스 밑에 256M를 늘릴수도있음
		// 2. 메모리 누수 확인 ->
		// 3. ...

		// 메모리 관련 메소드
		// totalMemory() : JVM의 모든 메모리 크기 반환
		// freeMemory() : JVM내의 사용 가능한 메모리 크기 반환
		// maxMemory() : JVM이 사용한 가장 큰 메모리 크기 반환
		int cnt = 100;
		for (int i = 1; i <= 15; i++) {
			System.out.println("Free Memory : " + Runtime.getRuntime().freeMemory() / (1024*1024) + "MB");
			int n = 2;
			int[] iArr = new int[cnt];
			do {
				iArr[n] = 0;
				n--;
			}while(n > 0);
			cnt *=5;
		}

	}
}
