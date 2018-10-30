package com.techlabs.sample.bank.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MakeConnection {
	private Connection conn = null;
	private ConnectionURL urlTool;

	public Connection connect() {

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			urlTool = new ConnectionURL();
			String url = urlTool.getURL();
			conn = DriverManager.getConnection(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
