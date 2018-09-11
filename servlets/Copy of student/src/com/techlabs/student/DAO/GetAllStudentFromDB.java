package com.techlabs.student.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.student.model.Student;


public class GetAllStudentFromDB {

	private Connection connection;
	DBConnection db = new DBConnection();

	public GetAllStudentFromDB() throws SQLException {
		connection = db.getConnection();
	}

    public List<Student> getAllUsers() {
        List<Student> studentList = new ArrayList<Student>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from student");
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getString("id"));
                student.setName(rs.getString("name"));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentList;
    }

}
