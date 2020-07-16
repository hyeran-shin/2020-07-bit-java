package com.bit.board.ui;

import java.util.Scanner;

import com.bit.board.BoardServiceFactory;
import com.bit.board.service.BoardService;

public abstract class BaseUI implements IBoardUI{ 
	private Scanner s ; 
	protected BoardService service;
	
	public BaseUI() {
		s = new Scanner(System.in);
		service = BoardServiceFactory.getInstance();
	}
	
	protected int scanInt(String msg) {
		System.out.println(msg);
		return Integer.parseInt(s.nextLine());
	}
	
	protected String scanStr(String msg) {
		System.out.println(msg);
		return s.nextLine();
	}

}
