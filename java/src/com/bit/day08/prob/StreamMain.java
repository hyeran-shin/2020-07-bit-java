package com.bit.day08.prob;

import java.util.Arrays;

// stream : 자바 8부터 추가된 기능
// 컬렉션, 배열 등의 저장요소를 하나씩 참조하며 함수형 인터페이스(람다식)를 적용하며 반복적으로 처리할 수 있도록 해주는 기능
public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<String> name = Arrays.asList("jeong", "pro", "jdk", "java");
//		long count = 0;
//		for (String n : name) {
//			if (n.contains("o"))
//				count++;
//		}
//		System.out.println(count);
//		
//		count = 0;
//		// Collection에서 스트림 생성
//		count = name.stream().filter(x -> x.contains("o")).count();
//		System.out.println(count);
//		
//		//배열로 스트림 생성
//		Double[] darr = {3.1,3.2,3.3};
//		Arrays.stream(darr);
//		
//		name.forEach(System.out::println);
//		int[] arr = {1,2,3,4,5};
//		IntStream stream = Arrays.stream(arr);
//		int sum = stream.sum();
//		System.out.println(sum);
//// stream은 최종 연산 후 소멸됨 -> 이후 연산 x 
////		int count = (int)stream.count();
//		int count = (int)Arrays.stream(arr).count();
//		System.out.println(count);
////		
//		List<String> sList = Arrays.asList("jeong", "pro", "jdk", "java");
//		Stream<String> stream =  sList.stream();
//		stream.forEach(x->System.out.println(x));
//		
//		sList.stream().sorted().forEach(s->System.out.println(s));
//				
		// reduce() 연산 : 프로그래머가 직접 지정하는 연산을 적용, 최종연산
		// 0 : 초깃값, 전달되는요소, 
//		List<Integer> array1 = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> array = array1.stream();
//		Arrays.stream(array).reduce(0,(a,b)->a+b);
		
		String[] greetings = {"안녕하세요~~~","hello","good morning","반갑습니다."};
//		Arrays.stream(greetings); // 스트림 생성
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;}
		));
		
//		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
	}
	
	
}
