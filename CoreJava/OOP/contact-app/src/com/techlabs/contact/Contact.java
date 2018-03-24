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
	}

	public void display() {
		List<String> list = Arrays.asList();

        String result = String.join(",", list);
        System.out.println(result);

	//	System.out.println("\n");
		//System.out.print("\tFirst Name:" + firstName);
		//System.out.print("\tLast Name:" + lastName);
		//System.out.print("\tEmail ID:" + email);

	}

	public void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter First Name:");
		firstName = s.nextLine();
		System.out.println("\nEnter Last Name:");
		lastName = s.nextLine();
		System.out.println("\nEnter Email:");
		email = s.nextLine();

	}

}
