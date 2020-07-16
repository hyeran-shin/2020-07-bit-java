package com.bit.board.ui;

import java.util.Scanner;

import com.bit.board.BoardServiceFactory;
import com.bit.board.service.BoardService;

//입력받는 기능? 추가흐름은 하위클래스로 만들것이댜ㅑ
public abstract class BaseUI implements IBoardUI{
	private Scanner sc;
	protected BoardService service; 
	
	public BaseUI() {
		sc = new Scanner(System.in);
		service = BoardServiceFactory.getInstance();
	}
	
	protected int scanInt(String msg) {
		System.out.println(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	
	
	
}
