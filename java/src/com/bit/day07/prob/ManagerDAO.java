package com.bit.day07.prob;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManagerDAO {
	private Scanner s = new Scanner(System.in);
	private ArrayList<ManagerVO> membersList = new ArrayList<>();
	
	
	public int menu() {
		System.out.println("----------- prob ------------");
		System.out.println("[처음 만나는 관리 프로그램] 메뉴를 선택하세요.");
		return getInputNumber("[1]:추가 [2]:삭제 [3]:검색 [4]:목록 [5]:수정 [0]:종료");
	}
	
	private int getInputNumber(String msg){
		System.out.println(msg);

		String str = s.nextLine();
		Pattern p = Pattern.compile("(^[0-9]*$)");
		Matcher m = p.matcher(str);
		int nums;
		
		if(m.find()) {
			nums =Integer.parseInt(str);
			return nums;
		}else {
			return -1;
		}
		// 문자열 검사, 숫자만 들어오게
		
//		return  nums;//입력 값 리턴
	}
	
	private String getInputString(String msg) {
		System.out.println(msg);
		return s.nextLine();
	}
	
	
	private ManagerVO findByNumber(int num) {
		for(ManagerVO vo : membersList) {
			if(vo.getId() == num ) {
				return vo;
			}
		}
		return null;
	}
	
	
	void insertMember() {
		int num = getInputNumber("추가할 회원 번호를 입력");
//		s.nextLine();
		if (num != -1) {
			ManagerVO member = findByNumber(num);

			if (member == null) {
				String name = getInputString("추가할 회원 이름을 입력");
				member = new ManagerVO(num, name);
				membersList.add(member);
				System.out.println(member.toString() + " 회원을 추가하였습니다.");
			} else if (member.getId() == num) {
				System.out.println("해당 번호의 회원은 이미 존재합니다.");
			}
		}else {
			System.out.println("회원 번호 : 숫자만 입력(문자X).");
		}
	}

	void deleteMember() {
		int num = getInputNumber("삭제할 회원번호 입력");
		ManagerVO vo = findByNumber(num);
		if(vo==null) {
			System.out.println("해당 번호의 회원이 존재하지 않습니다.");
			return;
		}
		membersList.remove(vo);
		System.out.println(vo.toString() + " 회원을 삭제하였습니다.");
		
	}
	
	void selectOneMember() {
		int num = getInputNumber("검색할 회원 번호 입력");
		ManagerVO vo = findByNumber(num);
		if(vo==null) {
			System.out.println("회원 번호가 존재하지 않습니다.");
			return;
		}
		System.out.println("[검색 결과] : " + vo.toString());
	}
	
	void selectMember() { 
		System.out.println("[회원 목록] ("+membersList.size() +")");
		if(membersList.size()==0) {
			System.out.println("가입회원이 존재하지 않습니다.");
		}
		for(ManagerVO vo : membersList){
			System.out.println(vo.toString());
		}
	}
	
	void updateMember() {
		int num = getInputNumber("수정할 회원번호 입력");
		ManagerVO vo = findByNumber(num); 
				
		if(vo==null) {
			System.out.println("회원 번호가 존재하지 않습니다.");
			return;
		}

		String name = getInputString("수정할 회원 이름 입력"); ////////////// Q

//		String n = s.nextLine();
		vo.setName(name);
		System.out.println(vo.toString() + "으로 수정되었습니다.");
		
	}
}
