package com.bit.book.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static ConnectionFactory conFactory;
	
	private ConnectionFactory() {}

	public static ConnectionFactory getConInstance() {
		if (conFactory == null) {
			conFactory = new ConnectionFactory();
		}
		return conFactory;
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hellodb?serverTimezone=UTC";
			String user = "root";
			String pw = "root";
			con = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
