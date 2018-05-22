package com.techlabs.composite;

public class Main {
	public static void main(String[] args) {
		Directory directory1=new Directory();
		
		Control control1=new Control("textBox", "textBox", "name");
		Control control2=new Control("button", "button", "submit");
		
		directory1.addElement(control1);
		directory1.addElement(control2);
		
		Directory directory2=new Directory();
		
		ControlGroup controlgroup1=new ControlGroup("div", "div", "div");
		ControlGroup controlgroup2=new ControlGroup("p", "p", "p");
		ControlGroup controlgroup3=new ControlGroup("body", "body", "body");
		
		directory2.addElement(controlgroup1);
		directory2.addElement(controlgroup2);
		directory2.addElement(controlgroup3);
		
		
		Directory directory3=new Directory();
		directory3.addElement(directory1);
		directory3.addElement(directory2);
		
		directory3.display();
		
	}
}
