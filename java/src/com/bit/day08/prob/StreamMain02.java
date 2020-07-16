package com.bit.day08.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("Using", "Stream","API","From","Java8");
		String[] strArr = {"Using", "Stream","API","From","Java8"};
		Stream<String> stream2 = Arrays.stream(strArr,0,1);
//		stream2.forEach(x->System.out.println(x)); //0부터 1까지 1포함x
		
		//무한 스트림 generate
//		Stream<Double> stream3 = Stream.generate(Math::random);
//		stream3.forEach(x->System.out.println(x));
		
		//filter()
		Stream<String> longStream = stream1.filter(w->w.length() >4);
//		longStream.forEach(x->System.out.println(x));
		//map()
//		Stream<Character> mapStream = stream1.map(s->s.charAt(0));
		
		

		String[] arr1 = new String[] {"Hello", "World", "Hell"};
		// 배열 -> list
		List<String> list = new ArrayList<>(Arrays.asList(arr1));
		
		Stream<String> stream = Arrays.stream(arr1); // 배열
		Stream<String> streamOfArrayPart = Arrays.stream(arr1, 1, 3); // 부분 배열
//		streamOfArrayPart.forEach(x->System.out.println(x));
		Stream<String> parallelStream =list.parallelStream(); //병렬처리스트림
//		parallelStream.forEach(x->System.out.println(x));
		
		//직접 생성하는 연산자
//		Stream streamNull = Stream.empty(); //null 대신 사용가능
		Stream<String> gStream =
				Stream.<String>builder().add("hello").add("world").build();
		// 특정 사이즈만큼 생성 
		Stream<String> gStream1 = 
				Stream.generate(() -> "sdkfn").limit(4);
//		gStream1.forEach(x->System.out.println(x));
		
		//iterate()
		Stream<Integer> iStream = Stream.iterate(30, n -> n+2).limit(5);
//		iStream.forEach(x->System.out.println(x));
		
		// 더하기
		List<Integer> sList = Arrays.asList(1,2,3,4,5);
		Integer sstream = sList.stream().reduce(0,(a,b)-> a+b);
		
		//reduce : 모든 요소를 소모하여 연산 수행, 
		int sum = sList.stream().reduce(0, Integer::max);

//		System.out.println(sstream);
//		System.out.println(sum);
//
//		Arrays.asList(3, 8, 9, 10, 20, 11, 22)
//        .stream()
//        .map(it -> it * it)
//        .forEach(x->System.out.println(x));

//		String arr[][] = {
//			    {"minus one", "zero", "one"}, 
//			    {"two", "Three"}, 
//			    {"Four", "Five", "Six"}, 
//			    {"eight", "ten"}
//			};
//
//			Stream.of(arr)
//			        .flatMap(Stream::of)
//			        .forEach(System.out::println);
//
//			int arrr[][] = {{1, 2, 3}, {4, 8}, {9, 10, 20}, {11, 22}};
//			Stream.of(arrr)
//			        .flatMapToInt(IntStream::of)
//			        .forEach(System.out::println);
//		
		
		
		Arrays.asList("312", "123", "123", "123", "1234")
        .stream()
        .peek(System.out::println)
        .map(it -> "#" + it)
        .forEach(System.out::println);
		
	}
}
