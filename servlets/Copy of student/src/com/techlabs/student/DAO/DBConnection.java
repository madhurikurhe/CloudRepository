package com.techlabs.student.DAO;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DBConnection {
		private static String url = "jdbc:mysql://localhost:3306/swabhav";
		private static String userName = "root";
		private static String password = "root";
		private static Connection connection = null;

		static Connection getConnection() throws SQLException {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				if (connection == null) {
					connection = DriverManager.getConnection(url, userName,
							password);
					System.out.println("Connected to  Database");
				}

			} catch (Exception e) {
				System.out.print("Error in connetcion : " + e.getMessage());
			} finally {
			
			}
			return connection;
		}

	}

