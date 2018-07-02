package com.techlabs.student;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student("madhu","unde","madhu");
		Student s2=new Student("madhu","unde","madhu");
		
		List<Student> student=new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		
		System.out.println(student);
		
	}
}
