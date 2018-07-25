package com.techlabs.contact;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contact {
	private String firstName;
	private String lastName;
	private int email;
	static int count = 0;

	public Contact(String fname, String lname, int email) {
		this.firstName = fname;
		this.lastName = lname;
		this.email = email;
	}

	public Contact() {
		// TODO Auto-generated constructor stub
	}



	public int setEmail(int email) {
		return this.email = email;
	}

	public int getEmail() {
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
