package com.bit.day07;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  List 주요 메소드
 *  	add			: 데이터 입력
 *  	addAll		: 기존 저장된 집합 객체 데이터 입력
 *  	get			: 데이터 추출(확인하기위한 추출)
 *  	size		: 입력된 데이터의 개수 반환
 *  	remove		: 특정 데이터 삭제
 *  	clear		: 모든 데이터 삭제
 *  	contains	: 특정 데이터의 존재 여부
 *  	isEmpty	 	: 비어있는지 체크
 *  
 *  iterator
 *  	인터페이스 객체 반환 목적 (반복자)
 *  	컬렉션들마다 데이터 저장 및 참조 방법이 다르기 때문에,
 *  	동일한 방법으로 순회할 수 있는 반복자 제공.
 *  
 *  	hasNext()	: 요소(Element)의 존재 유무 판단
 *  	next()		: 요소 추출
 *  	remove()	: 요소 삭제(반환)
*/
public class ListMain {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");

		// index 순회
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("");
		
		// foreach 순회
		for(String data : list) {
			System.out.print(data+" ");
		}System.out.println("");
		
		// collection에는 iterator라는 반복자를 제공해줌.
		// iterator 순회
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) { // 다음 요소가 존재한다면
			System.out.print(ite.next() + " ");
		}System.out.println("");
		
		
	}
}
