package com.techlabs.student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializationTest {

	public static void main(String[] args) throws Exception {

		int i = 0;
		int index = 0;
		String firstName;
		String lastName;
		String email;
		Student[] student = new Student[2];

		for (i = 0; i < student.length; i++) {

			student[i] = new Student();
		}

		student[0].setFirstName("Trisha");
		student[1].setFirstName("Madhu");

		student[0].setLastName("Kurhe");
		student[1].setLastName("Unde");

		student[0].setEmail("madhu");
		student[1].setEmail("trisha");

		/*
		 * List<Student> obj; obj = new ArrayList<Student>();
		 * 
		 * Scanner s1 = new Scanner(System.in); for (int j = 0; j < 2; j++) {
		 * System.out.println("\nEnter First Name:"); firstName = s1.nextLine();
		 * student[index].setFirstName(firstName);
		 * 
		 * System.out.println("\nEnter Last Name:"); lastName = s1.nextLine();
		 * student[index].setLastName(lastName);
		 * 
		 * System.out.println("\nEnter Email Name:"); email = s1.nextLine();
		 * student[index].setEmail(email); obj.add(student[index]); index++; }
		 */
		System.out.println("Student Details.....");
		for (Student d : student) {
			System.out.print("\n" + d.getFirstName());
			System.out.print("\t" + d.getLastName());
			System.out.print("\t" + d.getemail());
		}

		FileOutputStream fileOut = new FileOutputStream("Test1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(student);
		out.close();
		fileOut.close();
		System.out.println("\nSerialization Successful\n");

		Student[] student2=deserialize("Test1.txt");

		System.out.println("Student Details.....");
		for (Student d : student2) {
			System.out.print("\n" + d.getFirstName());
			System.out.print("\t" + d.getLastName());
			System.out.print("\t" + d.getemail());
		}

	}

	public static Student[] deserialize(String fileName) throws Exception {
		FileInputStream fileIn = new FileInputStream("Test1.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		System.out.println("Deserialized Data: \n");
		Object obj = in.readObject();
		Student[] students = (Student[]) obj;
		in.close();
		fileIn.close();
		return students;

	}

}
