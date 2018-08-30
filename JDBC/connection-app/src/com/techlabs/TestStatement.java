package com.techlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestStatement {
	private String url = "jdbc:mysql://localhost:3306/swabhav";
	private String userName = "root";
	private String password = "root";
	private Connection connection = null;

	public static void main(String[] arg) throws SQLException {

		TestStatement test = new TestStatement();
		test.getConnection();
	}

	private void getConnection() throws SQLException {

		try {
			if (connection == null) {
				connection = DriverManager.getConnection(url, userName,
						password);
				System.out.println("Connected to  Database");
				String query = "SELECT * FROM student1";

				Statement st = connection.createStatement();
				ResultSet rs = st.executeQuery(query);
				System.out.println(st.getClass());
				while (rs.next()) {
					int rollNo = rs.getInt("rollNo");
			        String firstName = rs.getString("firstName");
			        String lastName = rs.getString("lastName");
			        String gender = rs.getString("gender");
			        String cgpa = rs.getString("cgpa");
			        String collegeID = rs.getString("collegeID");

			        System.out.print("\nRoll Number:"+rollNo);
			        System.out.print("\tFirst Name:" +firstName);
			        System.out.print("\tLast Name:" +lastName);
			        System.out.print("\tGender:" +gender);
			        System.out.print("\tCGPA:" +cgpa);
			        System.out.print("\t\tCollegeID:" +collegeID);



				}

			}

		} catch (Exception e) {
			System.out.print("Error in connetcion : " + e.getMessage());
		} finally {
			connection.close();
		}
	}

}
