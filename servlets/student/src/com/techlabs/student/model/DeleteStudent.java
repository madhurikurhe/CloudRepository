package com.techlabs.student.model;

import java.util.List;

public class DeleteStudent {

	public List<Student> deleteStudent(String id){
		AllStudentService studentService=new AllStudentService();
		List<Student> studentList=studentService.getStudents();
		for(Student s:studentList){
			if(s.getId()==id){
				studentList.remove(s);
			}
		}
		
		for(Student s:studentList){
			System.out.println("ID:" +s.getId());
			System.out.println("Name:" +s.getName());
		}
		return studentList;
		
	}
}
