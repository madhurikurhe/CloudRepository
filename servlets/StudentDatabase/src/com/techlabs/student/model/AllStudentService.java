package com.techlabs.student.model;

import java.util.ArrayList;
import java.util.List;

public class AllStudentService {

	public List<Student> getStudents(){
		
		List<Student> studentList=new ArrayList<Student>();
		Student s1=new Student("1","Madhu");
		Student s2=new Student("2","Keisha");
		Student s3=new Student("3","Trisha");
		Student s4=new Student("4","Prasad");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		
		return studentList;
		
	}
}
