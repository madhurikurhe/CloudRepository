package com.techlabs.student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techlabs.student.model.Student;


public class UpdateDatabase {

	private Connection connection;
	DBConnection db = new DBConnection();

	public UpdateDatabase() throws SQLException {
		connection = db.getConnection();
	}

    public Student updateUser(Student user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update student set name=?" +
                            "where id=?");
            preparedStatement.setString(1, user.getName());     
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		return user;
    }

}
