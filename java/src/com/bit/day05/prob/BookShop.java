package com.bit.day05.prob;

import java.util.Scanner;
/*
 * [도서 대여 프로그램]
 * Q. 다음 Test Code가 정상적으로 동작하도록,
 * 	 Book 클래스를 정의하고, 메소드를 구현하세요.
 *   단, 대여여부는 기록하지 않는다. // 현재 대여중입니다.
 *   대여여부 기록 시 상태코드 활용(stateCode ==0)
*/

public class BookShop {
	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new Book(1, "해리포터", "롤링");
		books[1] = new Book(2, "이것이 자바다", "신용권");
		books[2] = new Book(3, "이펙티브 자바", "조슈아 블로크");
		books[3] = new Book(4, "자바의 정석", "남궁성");
		books[4] = new Book(5, "GoF의 디자인 패턴", "에릭 감마");
		
		Scanner s = new Scanner(System.in);
		System.out.println("대여할 도서의 번호를 입력 : ");
		int num=s.nextInt();
		s.close();
		
		for(Book book : books) {
			if(book.getBookNo() == num) { //books 내의 해당 번호의 book을 찾았다면,
				book.rent(); // 대여기능, "이것이 자바다"가 대여 됐습니다. -> 출력
				break;
			}
		}
		System.out.println();
		System.out.println("[현재 보유한 모든 도서 목록]");
		displayBookInfo(books);
		
	}
	
	private static void displayBookInfo(Book[] books) {
		// 도서 목록을 모두 출력하세요
		for(Book book : books) {
			book.print();
		}
	}
}
