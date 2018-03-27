package com.techlabs.contact;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contact implements Serializable {
	private String firstName;
	private String lastName;
	private String email;

	public Contact(String fname, String lname, String email) {
		this.firstName = fname;
		this.lastName = lname;
		this.email = email;
	}

	public Contact() {
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
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
