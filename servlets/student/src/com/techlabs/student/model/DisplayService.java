package com.techlabs.student.model;

import java.util.ArrayList;
import java.util.List;

public class DisplayService {

	public List<Student> displayStudent() {
		List<Student> list = new ArrayList<Student>();

		AllStudentService student = new AllStudentService();
		List<Student> studentList = student.getStudents();
		if (studentList != null){
		for(Student s:studentList){
			System.out.println("ID:" +s.getId());
			System.out.println("Name:" +s.getName());
		}
			return studentList;
		}
		else
			return list;

	}
}