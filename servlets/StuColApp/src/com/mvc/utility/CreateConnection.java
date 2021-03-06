package com.mvc.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
	
	private static CreateConnection createConnection = null;
	private Connection connection = null;
	private CreateConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Loaded driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/swabhav?"+"user=root&password=root");
			System.out.println("Connected successfully");
			System.out.println("Database Name: "+connection.getCatalog());
			
			//System.out.println(connection.getClass());
		} catch(Exception ex) {
			System.out.println("Error loading driver");
		}
		
	}
	
	public static CreateConnection getConnectionInstance() {
		if(createConnection == null) {
			createConnection =  new CreateConnection();
			return createConnection;
		} else {
			return createConnection;
		}
	}
	
	public Connection getConnection() {
		return this.connection;
	}
}