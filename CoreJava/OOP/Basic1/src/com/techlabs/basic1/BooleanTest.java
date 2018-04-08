package com.techlabs.basic1;

public class BooleanTest {
	public static void main(String[] args) {
		Boolean b=new Boolean(3,3);
		int r=b.comparison();
		if(r==b.a)
			System.out.println("A is greater than B");
		else if(r==b.b)
			System.out.println("B is grater than A");
		else 
			System.out.println("Two are numbers are equal");
	}	
}
