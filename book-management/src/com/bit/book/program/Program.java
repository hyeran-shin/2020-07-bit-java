package com.bit.book.program;

import com.bit.book.ui.MenuUI;

public class Program {
	public static void main(String[] args) {
		System.out.println("start ");
		
		MenuUI ui = new MenuUI();
		try {
			ui.process();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
