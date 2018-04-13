package com.techlabs.college;

import java.util.ArrayList;
import java.util.List;


public class CollegeTest {
	public static void main(String[] args) {
		List<Professor>p=new ArrayList();
		List<Student>s=new ArrayList();
		
		College college=new College();
		college.addStudent(new Student(101,"Mumbai","24",Branch.Civil));
		college.addStudent(new Student(102,"Pune","26",Branch.InformationTechnology));
		
		college.addProfessor(new Professor(103, "Shirdi", "21", 7));
		college.addProfessor(new Professor(104, "Kopargoan", "22", 8));
		
		p=college.displayAllProfessors();
		
		s=college.displayAllStudents();
	
		
	}
}
