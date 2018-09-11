package com.techlabs.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {


	private String url = "jdbc:mysql://localhost:3306/swabhav";
	private String userName = "root";
	private String password = "root";
	private Connection connection = null;

	
    public void deleteUser(String userId) throws ClassNotFoundException {
        
        	
        	try {
        		Class.forName("com.mysql.jdbc.Driver");
    			if (connection == null) {
    				connection = DriverManager.getConnection(url, userName,
    						password);
    				System.out.println("Connected to  Database");
    			
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from student where id=?");
            preparedStatement.setString(1, userId);
            preparedStatement.executeUpdate();

        }
        	}catch (SQLException e) {
            e.printStackTrace();
        }
    

}
}