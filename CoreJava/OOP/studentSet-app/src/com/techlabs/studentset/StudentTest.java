package com.techlabs.studentset;

import java.util.HashSet;

public class StudentTest {
	static HashSet<Student> set = new HashSet<Student>();

	public static void main(String args[]) {

		Student student1 = new Student(101,6,"Madhu");
		Student student2 = new Student(102,4,"Prasad");
		Student student3 = new Student(103,7,"Madhu");
		Student student4 = new Student(103,7,"Trisha");

		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);

		for (Student s : set) {
			System.out.println("\nRollNumber:" + s.rollNo);
			System.out.println("Standard:" + s.standard);
			System.out.println("Name:" + s.name);
			
		}
	}

}
