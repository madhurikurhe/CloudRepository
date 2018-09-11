package com.techlabs.student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.student.model.Student;

public class StudentDAO {

	Connection connection = null;

	public StudentDAO() throws SQLException {

		connection = DBConnection.getConnection();
	}

	public void addStudent(Student student) {

		try {

			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into student(id,name) values (?, ? )");
			preparedStatement.setString(1, student.getId());
			preparedStatement.setString(2, student.getName());
			int res = preparedStatement.executeUpdate();

			if (res > 0) {
				System.out.println("Added");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateStudent(Student student) {

		try {
			String sql = "UPDATE student SET id = ?, name = ? WHERE id = ? ";

			PreparedStatement pst = connection.prepareStatement(sql);

			pst.setString(1, student.getId());
			pst.setString(2, student.getName());

			int res = pst.executeUpdate();

			if (res > 0) {
				System.out.println("Updated");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteStudent(Student student) {

		try {

			String sql = "DELETE FROM student WHERE id = ? ";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, student.getId());

			int res = pst.executeUpdate();

			if (res > 0) {
				System.out.println("Deleted");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Student> getAllStudents() {

		List<Student> students = new ArrayList<Student>();

		try {

			String sql = "SELECT * FROM student ";

			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				Student student = new Student();

				student.setId(rs.getString(1));
				student.setName(rs.getString(2));

				students.add(student);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return students;
	}

	public Student getStudentById(String id) {

		Student student = null;

		try {

			String sql = "SELECT * FROM student WHERE id = ? ";

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				student = new Student();

				student.setId(rs.getString(1));
				student.setName(rs.getString(2));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
	}

}
