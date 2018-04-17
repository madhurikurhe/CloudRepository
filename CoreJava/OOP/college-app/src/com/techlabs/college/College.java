package com.techlabs.college;

import java.util.ArrayList;
import java.util.List;

public class College implements SalariedEmployee {
	private List<Student> students = new ArrayList<Student>();
	private List<Professor> professors = new ArrayList<Professor>();

	public void addStudent(Student student1) {

		students.add(student1);
	}

	public void addProfessor(Professor professor1) {

		professors.add(professor1);
	}

	public List<Student> displayAllStudents() {

		return students;
	}

	public List<Professor> displayAllProfessors() {

		return professors;
	}

	@Override
	public List<Professor> calculateSalary(List<Professor> professor) {
		for(Professor p:professor){
			p.salary=100* p.getNoOfHoursWorked();
			}
			return professor;
			}

}
