package com.techlabs.college;

import java.util.List;


public class CollegeTest {
	public static void main(String[] args) {
		List<Professor> professors;
		List<Student> students;
		College college = new College();
		college.addStudent(new Student(101, "Mumbai", "24", Branch.Civil));
		college.addStudent(new Student(102, "Pune", "26",
				Branch.InformationTechnology));

		college.addProfessor(new Professor(103, "Shirdi", "21", 7));
		college.addProfessor(new Professor(104, "Kopargoan", "22", 8));

		professors = college.displayAllProfessors();
		students = college.displayAllStudents();

		System.out.println("\nTotal Students:" + students.size());
		for (Student s : students) {
			System.out.print("\nID:" + s.getId());
			System.out.print("\tAddress:" + s.getAddress());
			System.out.print("\tDOB:" + s.getDateOfBirth());
			System.out.print("\tBranch:" + s.getBranch());

		}

		System.out.println("\nTotal Professors:" + professors.size());
		college.calculateSalary(professors);
		//college.calculateSalary(students);
		for (Professor p : professors) {
			System.out.print("\nID:" + p.getId());
			System.out.print("\tAddress:" + p.getAddress());
			System.out.print("\tDOB:" + p.getDateOfBirth());
			System.out.print("\tNo of hours Worked:" + p.getNoOfHoursWorked());
			System.out.println("\tSalary:" + p.salary);
		}

	}
}
