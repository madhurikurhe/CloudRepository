package com.techlabs.resume;

import java.util.Scanner;

public class ResumeBuilder {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String fname = scanner.nextLine();
		System.out.println("First Name = " + fname);
		
		System.out.print("Enter Last Name: ");
		String lname = scanner.nextLine();
		System.out.println("Last Name = " + lname);
		
		System.out.print("Enter email: ");
		String email = scanner.nextLine();
		System.out.println("Email = " + email);
		
		System.out.print("Enter mobile number: ");
		String mobileNo = scanner.nextLine();
		System.out.println("Mobile Number = " + mobileNo);
		
		
	}
}
