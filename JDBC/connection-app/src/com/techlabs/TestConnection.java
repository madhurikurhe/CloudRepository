package com.techlabs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConnection {

	private String url = "jdbc:mysql://localhost:3306/swabhav";
	private String userName = "root";
	private String password = "root";
	private Connection connection = null;

	public static void main(String[] arg) throws SQLException {

		TestConnection test = new TestConnection();
		test.getConnection();
	}

	private void getConnection() throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (connection == null) {
				connection = DriverManager.getConnection(url, userName,
						password);
			}
			
			System.out.println(connection.getClass());
			
			System.out.println();
			System.out.print("Connected to database");
			
			DatabaseMetaData data=connection.getMetaData();  
			    
			System.out.println(String.format("Database Name: %s", 
		            connection.getCatalog()));

			System.out.println("UserName: "+data.getUserName());  
			
			ResultSet result = data.getTables(null, null, "%", null);
			System.out.println("Total number of tables in database");
			while (result.next()) {
			  System.out.println(result.getString(3));
			}
		
		} catch (Exception e) {
			System.out.print("Error in connetcion : " + e.getMessage());
		}
		finally{
			connection.close();
		}
	}

}