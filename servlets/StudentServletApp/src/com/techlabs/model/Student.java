package com.techlabs.model;

public class Student {

    private int id;
    private String fName;
    private String lName;
        
    
    public Student(int userid1, String firstname1, String lastname1) {
    	this.id=userid1;
    	this.fName=firstname1;
    	this.lName=lastname1;
    	
    }
	public Student() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}	
}