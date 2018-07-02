package com.techlabs.contact;

import java.io.Serializable;
import java.util.ArrayList;

public class Contact implements Serializable {
	private String fname;
	private String lname;
	private String email;
	ArrayList<Contact> al;

	public Contact() {

	}

	public Contact(String fname, String lname, String email) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Contact> add() {
		al = new ArrayList<Contact>();
		al.add(this);
		return al;
	}

	public ArrayList<Contact> display() {
		// System.out.println(al.size());
		return al;
	}

}
