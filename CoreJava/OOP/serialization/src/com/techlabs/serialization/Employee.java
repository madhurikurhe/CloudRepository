package com.techlabs.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String email;

	public String toString() {
		return "\nfirstName=" + firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String FirstName) {
		this.firstName = FirstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
