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
