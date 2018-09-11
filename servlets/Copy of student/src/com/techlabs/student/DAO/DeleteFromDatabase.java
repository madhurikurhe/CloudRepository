package com.techlabs.student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteFromDatabase {

    
    	private Connection connection;
    	DBConnection db = new DBConnection();

    	public DeleteFromDatabase() throws SQLException {
    		connection = db.getConnection();
    	}
    	
    	public void deleteUser(String id) {
        try {
        	
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from student where id=?");
            // Parameters start with 1
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
