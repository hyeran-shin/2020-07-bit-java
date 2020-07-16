package com.bit.day07;
/* Stack Class
 * 	LIFO (Last In First Out)
 *  FILO (First In Last Out)
 *  형태의 임시 버퍼
 *  	: 버퍼에 임시로 데이터를 저장하였다가 필요할 때 꺼내 사용.
 *  	: 요철 시 가장 최근에 보관한 데이터부터 꺼낸다.
 *  
 *  public void push(Element data)   : 순차 보관
 *  public Element pop() 			 : 값을 반환(추출)
 *  public Element peek()			 : 값을 참조(확인) //어디 위치에 있어 단지 확인만.
 *  public boolean empty(), isEmpty(): 비어있는지 체크, isEmpty() 써라?, 두개 버전에따라 다름
 *  public int search(Element data)  : 특정 데이터의 위치값
 *  
*/

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
//		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> s = new Stack<>(); 
		
		s.push(3); //auto-boxing 일어남 
		s.push(5); //3,5
		s.push(7); //3,5,7
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		s.push(9);
		s.push(11);
		System.out.println("peek : " + s.peek()); //11, peek() 은 확인만
		System.out.println(s.pop());  //11
		
		// 현재 스택의 상태 : 3,9
		System.out.println(s.search(9)); // 9를 찾아라 -> 인덱스가 아닌 위에서 1번째 
		System.out.println(s.search(3)); // 인덱스가 아닌 위에서 2번째
		
		while(s.isEmpty() == false) {
			System.out.println(s.pop());
		}
		//비어있는상태
		System.out.println(s.pop());
		// EmptyStackException 발생
	}
}
