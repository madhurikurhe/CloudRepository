package com.techlabs.college;

import java.util.ArrayList;
import java.util.List;

public class College {
	List<Student> student = new ArrayList<Student>();
	List<Professor> professor = new ArrayList<Professor>();

	public void addStudent(Student student1) {

		student.add(student1);
	}

	public void addProfessor(Professor professor1) {

		professor.add(professor1);
	}

	public List<Student> displayAllStudents() {
		System.out.println("\nTotal Students:"+student.size());
		for (Student s : student) {
			System.out.print("\nID:" + s.getId());
			System.out.print("\tAddress:" + s.getAddress());
			System.out.print("\tDOB:" + s.getDateOfBirth());
			System.out.print("\tBranch:" + s.getBranch());

		}
		return student;
	}

	public List<Professor> displayAllProfessors() {
		System.out.println("\nTotal Professors:"+professor.size());
		for (Professor p : professor) {
			System.out.print("\nID:" + p.getId());
			System.out.print("\tAddress:" + p.getAddress());
			System.out.print("\tDOB:" + p.getDateOfBirth());
			System.out.print("\tNo of hours Worked:" + p.getNoOfHoursWorked());

		}
		return professor;
	}

}
