package com.bit.board;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

import com.bit.board.ui.IBoardUI;

/*
 *  리플렉션 (Reflection)
 *   - 클래스 정보, 이름만으로 클래스 내용을 수행하는거?
 *   - 프로그램을 실행할 때 어떤 것을 실행하느냐에 따라 각각 다르게 만들어진다.
 *   - 동적인 방식 -> 실행할 때 마다 해당 객체가 동적으로 생성.
 *   - 클래스 정보(이름)를 몰라도 해당 클래스의 필드, 메소드들을 접근할 수 있다.
 *   
 *   대표 메소드 
 *   	getDeclaredFields() 	: 필드 리스트를 반환
 *   	getDeclaredMethods()	: 메소드 리스트를 반환
*/

public class BoardUIMapping {
	private HashMap<String, IBoardUI> mapping;
	
	public BoardUIMapping() throws Exception{ //예외를 호출한 곳으로 넘겨 , BoardUI에서 받을거야
		mapping = new HashMap<>();
		
		Properties prop = new Properties();
		InputStream is = new FileInputStream("board_config.properties"); // 통로열고
		prop.load(is);
		// board_config.properties 파일의 설정 정보를 읽어들여라
		
		// Java Properties File
		//  insert=com.bit.board.ui.InsertUI
		//  insert -> key
		//  com.bit.board.ui.InsertUI -> className  
		// 		-> 단순히 Map과 같이 key-value 방식!
		
		String key ="";
		String className ="";
		
		Enumeration<Object> e = prop.keys();
		// 처음부터 순회할 때 (Iterator)
		// 타입이 무너지 모르니 Object로 받겠다.
		
		while(e.hasMoreElements()) { // 요소(Element) 가 있는지?
			key = (String) e.nextElement();
			// 로드된 값의 왼쪽 추출 ( key) -> '='기준으로
			
			className = (String)prop.get(key);
			// 로드된 값의 오른쪽 추출(className, value)
			
			mapping.put(key,(IBoardUI)Class.forName(className).newInstance());
			// com.bit.board.ui.InsertUI
			// 	-> 경로 정보를 가지고 클래스 등록 후 생성
			// newInstance() : 동적으로 객체를 생성하는 메소드
			// 	-> return type : Object
			
			//mapping 은 hashMap<String,IBoardUI> , class.forname~은 Object타입, 인터페이스인 IBoardUI로 형변환
		}
	}
	public IBoardUI getBoardUI(String key) {
		return mapping.get(key);//key의 value 값 -> 클래스 경로를 return 
		// BoardUI에서 호출 후 생성자에서 프로퍼티 파일 읽고 난 뒤 
		// mapping에는 key에 맞는 value 값 들어가있음
		// return 하면 해당 클래스 나옴
		
		
	}
	
}









