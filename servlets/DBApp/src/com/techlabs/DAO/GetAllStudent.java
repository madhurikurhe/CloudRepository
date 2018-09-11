package com.techlabs.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;


public class GetAllStudent {

	private String url = "jdbc:mysql://localhost:3306/swabhav";
	private String userName = "root";
	private String password = "root";
	private Connection connection = null;



    public List<Student> getAllUsers() throws SQLException {
    	List<Student> studentList = new ArrayList<Student>();
    	try {
    		Class.forName("com.mysql.jdbc.Driver");

			if (connection == null) {
				connection = DriverManager.getConnection(url, userName,
						password);
				System.out.println("Connected to  Database");
				
				
				Statement statement = connection.createStatement();
	            ResultSet rs = statement.executeQuery("select * from student");
	            while (rs.next()) {
	                Student student = new Student();
	                student.setId(rs.getString("id"));
	                student.setName(rs.getString("name"));
	                studentList.add(student);
	            }
			}

		} catch (Exception e) {
			System.out.print("Error in connetcion : " + e.getMessage());
		} 

  return studentList;
    }

}
