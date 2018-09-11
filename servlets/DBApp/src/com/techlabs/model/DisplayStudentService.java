package com.techlabs.model;

import java.sql.SQLException;
import java.util.List;

import com.techlabs.DAO.GetAllStudent;

public class DisplayStudentService {

	public List<Student> getStudent() throws SQLException{
		GetAllStudent student=new GetAllStudent();
		List<Student> studentList;
		studentList=student.getAllUsers();
		for(Student s:studentList){
			System.out.println("ID:" +s.getId());
			System.out.println("Name:" +s.getName());
		}
		return studentList;
	}
}
