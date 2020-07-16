package com.bit.day07;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue
 * 	FIFO(First In First Out)
 * 	LILO(Last In Last Out)
 *  형태의 임시 버퍼 	
 *  	-> 요청 시 가장 먼저 보관한 것을 꺼낸다.
 *  
 *  public void offer(Element data) 	: 데이터 보관
 *  public Element poll()				: 값을 반환 (추출)
 *  public Element peek()				: 값을 참조 (확인)
 *  public boolean isEmpty 				: 비어있는지 체크
 *  
*/
public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		q.offer("정우성");
		q.offer("현빈");
		q.offer("강동원");
		System.out.println(q.peek()); // 정우성
		System.out.println(q.poll()); // 정우성
		System.out.println(q.poll()); // 현빈
		
		q.offer("손예진");
		
		while(q.isEmpty() == false) {
			System.out.println(q.poll());
		}
		// 비어있는 상태
		System.out.println(q.peek()); //null, linkedList여서 null 출력
		System.out.println(q.poll()); //null
	}

}
