package com.techlabs.composite;

public class ControlGroup implements IDOMElement{

	private String id;
	private String type;
	private String name;
	
	
	public ControlGroup(String id, String type, String name) {
		this.id = id;
		this.type = type;
		this.name = name;
	}


	@Override
	public void display() {
		System.out.println("<" + type + "/>");
	}

}
