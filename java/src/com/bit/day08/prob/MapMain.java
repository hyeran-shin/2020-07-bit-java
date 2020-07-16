package com.bit.day08.prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MapMain {
	public static void main(String[] args) {
		/*
		 * Q. 회원가입 및 비밀번호 변경 프로그램 (Map) 회원 정보를 관리하는 Member 클래스를 정의 회원가입은 Id와 Pw를 입력받고,
		 * 비밀번호 변경은 일치하는 ID와 Pw에 한해, 변경이 가능하도록 작성하세요.
		 * 
		 */
//		
//		List<Member> mList = new ArrayList<>();
//		mList.add(new Member("정우성", "1111"));
//		mList.add(new Member("현빈", "2222"));
//		mList.add(new Member("손예진", "3333"));
//		
//		System.out.println("회원 목록(ID , PASSWORD) ");
//		for(Member m : mList) {
//			System.out.println("ID : " + m.getId() + ", PASSWORD : " + m.getPw());
//		}
		String id, pw;
		List<Member> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("id 입력 : ");
			id = s.nextLine();
			System.out.println("pw 입력 : ");
			pw = s.nextLine();
			
			list.add(new Member(id, pw));
			System.out.println("가입 완료");
			for (Member m : list) {
				System.out.println("id : " + m.getId() + ", pw : " + m.getPw());
			}

			System.out.println("비밀번호 변경");
			System.out.println("id 입력 : ");
			id = s.nextLine();
			
		}
		s.close();
	}
}

class Member {
	private String id;
	private String pw;

	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw() {
		return pw;
	}
}
