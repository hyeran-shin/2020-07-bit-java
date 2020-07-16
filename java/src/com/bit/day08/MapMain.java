package com.bit.day08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Map 주요 메소드 	K : key 타입, V : value 타입
 * 
 * 		- V put(K key, V value)		: 데이터 입력
 * 		- V get(K key)				: 특정 key에 대한 value 추출
 * 		- V remove(Object key)		: 특정 key에 대한 Map 요소 삭제
*/

public class MapMain {
	public static void main(String[] args) {
		Map<String, String> map =  new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		
		// key의 중복을 허용하지 않는다.
		// 하지만, 동일 키에 대한 입력은 업데이트!
		map.put("bbb","1111"); // value는 중복 허용
		System.out.println("aaa key에 대한 value : " + map.get("aaa"));
		System.out.println("bbb key에 대한 value : " + map.get("bbb"));
		System.out.println("ccc key에 대한 value : " + map.get("ccc"));
		
		
		// 비밀번호 변경
		Scanner s = new Scanner(System.in);
		System.out.println("ID 입력 : ");
		String id = s.nextLine();
		
		// key
		if(map.containsKey(id)) { // 해당키가 존재하는지를 반환해주는
			 System.out.println("ID : [" + id + "]");
		}else {
			System.out.println("해당 ID는 존재하지 않습니다.");
			System.out.println("[System] : 프로그램 종료");
			System.exit(0); // 프로그램 종료
		}
		
		//종료 안되고 넘어오면 key가 존재하는것
		// value
		System.out.println("현재 PassWord 입력 : ");
		String pw = s.nextLine();
		
		// 넘어온 key에 대한 password가 map 요소의 value와 일치하는지 
		if(map.get(id).equals(pw)) { // 메소드 체인(함수 체인)
									// map.get(id) -> String, String.equals(pw) -> 바로호출
			System.out.println("[System] : 일치합니다. ");
			System.out.print("변경 할 PW 입력 : ");
			String newPw = s.nextLine();
			map.put(id, newPw); // 업데이트
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			System.out.println("[System] : 일치하지 않습니다. 프로그램 종료");
			System.exit(0);
		}
		System.out.println("비밀번호가 변경되었습니다.");
		
		// entrySet() 집합목록이라고 보면됨?
		Set<Entry<String,String>> entry = map.entrySet();
		for (Entry<String, String> e : entry) {// Set안에있는 Entry<String,String> 타입으로 받아줘야 한다
			System.out.println("ID : " + e.getKey() + ", PW : " + e.getValue());
		}
		
		s.close();
		
		/*
		 *  Q. 회원가입 및 비밀번호 변경 프로그램 (Map)
		 *  	회원 정보를 관리하는 Member 클래스를 정의
		 *  	회원가입은 Id와 Pw를 입력받고,
		 *  	비밀번호 변경은 일치하는 ID와 Pw에 한해, 
		 * 		변경이 가능하도록 작성하세요.
		 * 
		*/
		
		List<Member> mList = new ArrayList<>();
		mList.add(new Member("정우성", "1111"));
		mList.add(new Member("현빈", "2222"));
		mList.add(new Member("손예진", "3333"));
		
		System.out.println("회원 목록(ID , PASSWORD) ");
		for(Member m : mList) {
			System.out.println("ID : " + m.getId() + ", PASSWORD : " + m.getPw());
		}
		
		// HashTable
		Map<String, Integer> table = new Hashtable<String, Integer>();
		table.put("one", new Integer(1)); // boxing, 내가 직접 해준것
		table.put("two", 2); // auto-boxing , 자동으로 오토박싱해줌 
		table.put("three", 3);
		
		Integer iVal = table.get("two");
		System.out.println(iVal);
		
		// 제공하는 메소드의 동기화 여부 , 싱크로나이즈:기계처럼 한번에 맞게?
		Map<String, String> myMap = new Hashtable<>();
		// null을 허용하지 않는다. 동기화가 되어있음. 다른곳에서 안에있는 자원을 사용하고자 하면은 A가쓰고있으면 B는 쓸 수 없음,
//		Map<String,String> myMap = new HashMap<>();
		// map은 기본이라  null을 허용하고 동기화를 지원하지 않음., 동기화가 되어 있지 않음.
		// 	 -> 자원 공유의 문제점, 멀티쓰레드 환경에서 조심.
		myMap.put("one","1");
		myMap.put("two","2");
		myMap.put("three",null); // NullPointerException
		
		
		
	}							
}


class Member{
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









