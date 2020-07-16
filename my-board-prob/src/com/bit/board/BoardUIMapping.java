package com.bit.board;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

import com.bit.board.ui.IBoardUI;

public class BoardUIMapping {
	private HashMap<String, IBoardUI> mapping;

// 프로퍼티스 파일 읽은 후 입력된 번호 맞는 클래스 경로 매핑
	public BoardUIMapping() throws Exception {
		mapping = new HashMap<>();
		Properties prop = new Properties();
		InputStream is = new FileInputStream("board_config.properties");
		prop.load(is);

		String key = "";
		String className = "";
		// Enumeration 열거형 원소를 다루기 위한 인터페이스
		Enumeration<Object> e = prop.keys(); // 프로터피스 파일의 key받음
		while (e.hasMoreElements()) {
			key = (String) e.nextElement();
			className = (String) prop.get(key);
			mapping.put(key, (IBoardUI) Class.forName(className).newInstance());
		}
	}
	
	public IBoardUI getBoardUI(String key) {
		return mapping.get(key);
	}
}
