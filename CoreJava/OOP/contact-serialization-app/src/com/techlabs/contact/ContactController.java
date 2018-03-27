package com.techlabs.contact;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import com.techlabs.contact.test.ContactStoreTest;

public class ContactController {
	static int index = 0;
	static final int DISPLAY = 1;
	static final int ADD = 2;
	static final int EXPORT = 3;
	static final int EXIT = 4;
	static int choice;
	static String fileName = "employee.ser";
	private static final String COMMA_DELIMITER = ",";

	public static void main(String args[]) throws Exception {
		Contact[] contact = new Contact[10];
		ContactStoreTest cst = new ContactStoreTest();
		Scanner s = new Scanner(System.in);
		ContactStore store = new ContactStore(fileName);
		String firstName;
		String lastName;
		String email;
		do {
			System.out.println("\n\tMENU");
			System.out.println("\t1.Display");
			System.out.println("\t2.Add");
			System.out.println("\t3.Export");
			System.out.println("\t4.Exit");
			System.out.println("\tEnter Your Choice:");

			choice = s.nextInt();

			switch (choice) {
			case DISPLAY:
				Contact[] contacts = store.retrieve();

				for (int i = 0; i < contacts.length; i++) {
					System.out.println("FirstName:"
							+ contacts[i].getFirstName());
					System.out.println("LastName:" + contacts[i].getLastName());
					System.out.println("Emaill:" + contacts[i].getEmail());
				}
				break;

			case ADD:
				contact[index] = new Contact();
				Scanner s1 = new Scanner(System.in);
				System.out.println("\nEnter First Name:");
				firstName = s1.nextLine();
				contact[index].setFirstName(firstName);
				System.out.println("\nEnter Last Name:");
				lastName = s1.nextLine();
				contact[index].setLastName(lastName);
				System.out.println("\nEnter Email" + ":");
				email = s1.nextLine();
				contact[index].setEmail(email);
				index++;
				break;
			case EXPORT:
				FileWriter fileWriter = null;
				fileWriter = new FileWriter("Contact.csv");
				BufferedWriter out = new BufferedWriter(
						new FileWriter(
								"D:\\CloudRepository\\CoreJava\\OOP\\contact-serialization-app\\Contact.csv"));
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
			case EXIT:
				store.save(contact);
				int i = contact.length;
				System.out.println("Size of Array:" + i);
				System.out.println("Save test case passed");
			}

		} while (choice != EXIT);

	}

}
