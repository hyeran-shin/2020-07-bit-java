package com.bit.board;

import com.bit.board.service.BoardService;

public class BoardServiceFactory {

	private static BoardService service = null;
	
	//싱글톤 패턴
	public static synchronized BoardService getInstance() {
		if(service == null) {
			service = new BoardService();
			return service;
		}
		return service;
	}
}
