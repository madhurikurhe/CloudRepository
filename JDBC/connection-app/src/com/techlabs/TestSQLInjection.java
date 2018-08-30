package com.techlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.PreparedStatement;

public class TestSQLInjection {
	private String url = "jdbc:mysql://localhost:4040/swabhav";
	private String userName = "root";
	private String password = "root";
	private Connection connection = null;

	public static void main(String[] args) throws SQLException {

		TestSQLInjection test = new TestSQLInjection();
		test.getConnection();
	}

	private void getConnection() throws SQLException {
		Scanner sc = new Scanner(System.in);

		try {

			if (connection == null) {
				connection = DriverManager.getConnection(url, userName,
						password);
				System.out.println("Connected to  Database");

				java.sql.PreparedStatement ps = connection
						.prepareStatement("SELECT * FROM student1 WHERE rollNo = ?");

				System.out.println("Enter RollNumber of Student:");
				String rollNumber = sc.nextLine();
				int roll=Integer.parseInt(rollNumber);
				ps.setInt(1, roll);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					int rollNo = rs.getInt("rollNo");
					String firstName = rs.getString("firstName");
					String lastName = rs.getString("lastName");
					String gender = rs.getString("gender");
					String cgpa = rs.getString("cgpa");
					String collegeID = rs.getString("collegeID");

					System.out.print("\nRoll Number:" + rollNo);
					System.out.print("\tFirst Name:" + firstName);
					System.out.print("\tLast Name:" + lastName);
					System.out.print("\tGender:" + gender);
					System.out.print("\tCGPA:" + cgpa);
					System.out.print("\t\tCollegeID:" + collegeID);

				}

			}

		} catch (Exception e) {
			System.out.print("Error in connetcion : " + e.getMessage());
		} finally {
			connection.close();
		}
	}

}
