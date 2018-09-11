package com.techlabs.student.model;

import java.util.List;

public class AddService {

	public List<Student> addStudentService(Student stu){
		AllStudentService student=new AllStudentService();
		List<Student> studentList=student.getStudents();
		System.out.println("Size before addition:"+studentList.size());
		studentList.add(stu);
		System.out.println("Size after addition:"+studentList.size());
		return studentList;
		
	}
}

