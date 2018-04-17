package com.techlabs.student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {

		Set<Student> set = new TreeSet<Student>();
		//Set<Student>set=new HashSet<Student>();
		Student s1=new Student(101, "Madhu");
		set.add(s1);
		set.add(s1);

		System.out.println("Size:" + set.size());

	}

}
