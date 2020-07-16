package com.bit.book.factory;

import com.bit.book.service.BookService;

public class ServiceFactory {
	private static BookService service;

	public static synchronized BookService getInstance() {
		if (service == null) {
			service = new BookService();
			return service;
		}
		return service;
	}
}
