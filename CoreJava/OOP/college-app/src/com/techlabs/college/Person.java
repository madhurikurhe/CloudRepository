package com.techlabs.college;

public class Person extends College {
	private int id;
	private String address;
	private String dateOfBirth;

	public Person(int id, String address, String dateOfBirth) {
		this.id = id;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
