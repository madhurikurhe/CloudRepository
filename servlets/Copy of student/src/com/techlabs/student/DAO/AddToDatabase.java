package com.techlabs.student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techlabs.student.model.Student;


public class AddToDatabase {
	private Connection connection;
	DBConnection db=new DBConnection();
	public AddToDatabase() throws SQLException {
        connection = db.getConnection();
    }

    public void addUser(Student student) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into student(id,name) values (?, ? )");
            preparedStatement.setString(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	
	
}
