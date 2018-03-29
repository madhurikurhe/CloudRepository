package com.techlabs.studentset;

public class Student {
	int rollNo;
	int standard;
	String name;

	public Student(int rollNo, int standard, String name) {
		this.rollNo = rollNo;
		this.standard = standard;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		result = prime * result + standard;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student student = (Student) obj;
		if (rollNo != student.rollNo)
			return false;
		if (standard != student.standard)
			return false;
		return true;
	}


}
