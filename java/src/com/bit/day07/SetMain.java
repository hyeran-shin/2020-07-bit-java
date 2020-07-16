package com.bit.day07;
/*
 * Set 주요 메소드
 * 		add			: 데이터 입력
 * 		remove		: 특정 데이터 삭제
 * 		clear		: 모든 데이터 삭제
 * 		size		: 집합 객체의 크기 반환
 * 		contains	: 특정 요소의 존재 여부
 * 		inEmpty		: 비어있는지에 대한 여부
 * 		toArray		: 배열로 반환
 * 		iterator	: 반복자
 * 
 * Set에서 요소를 모두 출력하는 3가지
 * 		- foreach
 * 		- iterator
 * 		- toArray
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // set은 인터페이스, 구현하는 방법이 두가지가 있음 한가지는 해쉬, 하나는 트리셋 
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		// 특징 1. 중복을 허용하지 않는다.
		System.out.println("입력 여부 : " + set.add("two")); //false
		System.out.println("입력 여부 : " + set.add("six")); //true
		
		// 특징 2. 저장 순서가 없다.
		for(String s : set) {
			System.out.print(s + " ");
		}System.out.println("");
		
		set = new TreeSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		System.out.println("");

		//toArray 순회
		Object[] obj = set.toArray(); 
		System.out.println(Arrays.toString(obj));
		
		// String[] 타입으로 강제 형변환해도 예외 발생 
//		String[] strArr = (String[]) set.toArray(); //형변환 불가, object형식의 배열로 받아줘야한다.
//		System.out.println(Arrays.toString(strArr)); // 실행은 되지만 오류 발생
	}
}





