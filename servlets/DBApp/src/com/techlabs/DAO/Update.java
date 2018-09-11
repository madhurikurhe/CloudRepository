package com.techlabs.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techlabs.model.Student;


public class Update {
	private String url = "jdbc:mysql://localhost:3306/swabhav";
	private String userName = "root";
	private String password = "root";
	private Connection connection = null;

    public void updateUser(Student student) throws ClassNotFoundException {
        try {        	
        		Class.forName("com.mysql.jdbc.Driver");
    			if (connection == null) {
    				connection = DriverManager.getConnection(url, userName,
    						password);
    				System.out.println("Connected to  Database");
    				
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update student set id=?, name=?" +
                            "where id=?");
            preparedStatement.setString(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.executeUpdate();
    			}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
