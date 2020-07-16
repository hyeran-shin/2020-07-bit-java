package com.bit.day07.vector;

import java.util.Scanner;
import java.util.Vector;

/*
 *  Vector
 *  	- 1.0부터 제공
 *  	- 동기화 (synchronized)
 *  	- 단일 쓰레드에서 단점
 *  	- 잘안씀 : list가 있어서
 *  
 *  List
 *  	- 1.2부터 제공
 *  	- 동기화가 필요하다면, synchronizedList 활용
*/
public class Manager {
	private Scanner s = new Scanner(System.in);
	private Vector<Member> members = new Vector<>();
	
	public void process() { //외부에서는 얘만 실행되게끔 만들거야
		int key = 0 ;
		while((key=menu())!=0) {
			switch(key) {
			case 1: insertMember(); break;
			case 2: deleteMember(); break;
			case 3: selectOneMember(); break;
			case 4: selectMember(); break;
			// updateMember() 수정기능을 구현하세요. member에 setter 구현
			}
		}
	}
	
	private int menu() {
		System.out.println("[처음 만나는 관리 프로그램] 메뉴를 선택하세요.");
		return getInputNumber("[1]:추가 [2]:삭제 [3]:검색 [4]:목록 [0]:종료");
	}
	private int getInputNumber(String msg) {
		System.out.println(msg);
		return s.nextInt();
	}
	private String getInputString(String msg) {
		System.out.println(msg);
		return s.nextLine();
	}
	private void insertMember() {
		int num = getInputNumber("추가할 회원 번호를 입력 ");
		s.nextLine();
		//TODO 이미 회원 번호가 존재하는 경우 , findByNumber
		String name = getInputString("추가할 회원 이름을 입력 ");
		Member member = new Member(num,name);
		members.add(member);
		System.out.println(member.toString() +" 회원을 추가하였습니다.");
	}
	private void deleteMember() {
		int num = getInputNumber("삭제할 회원번호 입력 " );
		Member member = findByNumber(num);
		if(member==null) {
			System.out.println("해당 번호의 회원이 존재하지 않습니다.");
			return;
		}
		members.remove(member);
		System.out.println(member.toString() + "회원을 삭제하였습니다.");
	}
	private void selectOneMember() {	
		int num = getInputNumber("검색할 회원 번호를 입력");
		Member member = findByNumber(num);
		if(member ==null) {
			System.out.println("회원 번호가 존재하지 않습니다.");
			return ;
		}
		System.out.println("[검색결과] : "+member.toString());
		
	}
	private void selectMember() {
		System.out.println("[회원 목록] (" + members.size()+ ")");
		if(members.size()==0)
			System.out.println("가입회원이 존재하지 않습니다.");
		for(Member member : members)
			System.out.println(member.toString());
	
	}
	
	private Member findByNumber(int num) {
		for(Member member : members) {
			if(member.getNum() == num ) {
				return member;
			}
		}
		return null;
	}
}
