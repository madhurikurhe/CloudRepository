package com.techlabs.contact;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class ContactTest {

	static int index = 0;
	static final int display = 1;
	static final int add = 2;
	static final int export = 3;
	static final int exit = 4;
	static int ch;
	static String fileName = "employee.ser";
	private static final String COMMA_DELIMITER = ",";

	public static void main(String args[]) throws Exception {
		Contact[] contact = new Contact[3];
		ContactStore cs = new ContactStore();
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("\n\tMENU");
			System.out.println("\t1.Display");
			System.out.println("\t2.Add");
			System.out.println("\t3.Export");
			System.out.println("\t4.Exit");
			System.out.println("\tEnter Your Choice:");

			ch = s.nextInt();
			String firstName;
			String lastName;
			String email;
			
			switch (ch) {
			case display:

				System.out.println("Object DeSerialized");
				contact = cs.deserialize(fileName);
				for(int i=0;i<index;i++)
				System.out.println(contact[i].toString());
				break;
				
			case add:
				contact[index] = new Contact();
				Scanner s1 = new Scanner(System.in);
				System.out.println("\nEnter First Name:");
				firstName = s1.nextLine();
				contact[index].setFirstName(firstName);
				System.out.println("\nEnter Last Name:");
				lastName = s1.nextLine();
				contact[index].setLastName(lastName);
				System.out.println("\nEnter Email:");
				email = s1.nextLine();
				contact[index].setEmail(email);
				index++;
				break;
			case export:
				FileWriter fileWriter = null;
				fileWriter = new FileWriter("Contact.csv");
				BufferedWriter out = new BufferedWriter(
						new FileWriter(
								"D:\\CloudRepository\\CoreJava\\OOP\\contact-app\\Contact.csv"));
				for (int i = 0; i < index; i++) {
					out.write(contact[i].getFirstName());
					out.write(COMMA_DELIMITER);
					out.write(contact[i].getLastName());
					out.write(COMMA_DELIMITER);
					out.write(contact[i].getEmail());
					out.newLine();

				}
				out.close();
				System.out.println("Write to CSV file Succeeded!!!");
				fileWriter.close();

				break;
			}
			
		} while (ch != exit);
		Contact contact1 = (Contact) cs.serialize(contact, fileName);
		System.out.println("Object Serialized");
	}
}
