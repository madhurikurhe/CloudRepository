package com.techlabs.contact;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	static int count = 0;

	public Contact(String fname, String lname, String email) {
		this.firstName = fname;
		this.lastName = lname;
		this.email = email;
	}

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public void display() {

		System.out.println("\n");
		System.out.print("\tFirst Name:" + firstName);
		System.out.print("\tLast Name:" + lastName);
		System.out.print("\tEmail ID:" + email);

	}

	public void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter First Name:");
		firstName = s.nextLine();
		setFirstName(firstName);
		System.out.println("\nEnter Last Name:");
		lastName = s.nextLine();
		setLastName(lastName);
		System.out.println("\nEnter Email:");
		email = s.nextLine();
		setEmail(email);

	}

	public String setEmail(String email) {
		return this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
