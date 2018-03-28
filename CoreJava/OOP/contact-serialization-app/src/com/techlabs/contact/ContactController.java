package com.techlabs.contact;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.contact.test.ContactStoreTest;

public class ContactController {
	private static int index = 0;
	private static final int DISPLAY = 1;
	private static final int ADD = 2;
	private static final int EXPORT = 3;
	private static final int EXIT = 4;
	private static int choice;
	private static String fileName = "contact.ser";
	private static final String COMMA_DELIMITER = ",";
	static List<Contact> contactList = new ArrayList<Contact>();

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		ContactStore store = new ContactStore(fileName);

		do {
			System.out.println("\n\tMENU");
			System.out.println("\t1.Display");
			System.out.println("\t2.Add");
			System.out.println("\t3.Export");
			System.out.println("\t4.Exit");
			System.out.println("\tEnter Your Choice:");

			choice = scanner.nextInt();

			switchChoice(choice, contactList, store);

		} while (choice != EXIT);

	}

	private static void switchChoice(int choice, List<Contact> contact,
			ContactStore store) throws Exception, IOException {

		switch (choice) {

		case DISPLAY:
			display(store);
			break;

		case ADD:
			add();
			break;
		case EXPORT:
			export();

			break;
		case EXIT:
			exit(store);
		}
	}

	private static void exit(ContactStore store) throws Exception {
		store.save(contactList);
	}

	private static void export() throws IOException {
		FileWriter fileWriter = null;
		fileWriter = new FileWriter("Contact.csv");
		BufferedWriter out = new BufferedWriter(
				new FileWriter(
						"D:\\CloudRepository\\CoreJava\\OOP\\contact-serialization-app\\Contact.csv"));
		for (int i = 0; i < index; i++) {
			out.write(((Contact) contactList).getFirstName());
			out.write(COMMA_DELIMITER);
			out.write(((Contact) contactList).getLastName());
			out.write(COMMA_DELIMITER);
			out.write(((Contact) contactList).getEmail());
			out.newLine();

		}

		out.close();
		System.out.println("Write to CSV file Succeeded!!!");
		fileWriter.close();
	}

	private static void add() {
		String firstName;
		String lastName;
		String email;
		Contact contact = new Contact();
		Scanner s1 = new Scanner(System.in);

		System.out.println("\nEnter First Name:");
		firstName = s1.nextLine();
		contact.setFirstName(firstName);

		System.out.println("\nEnter Last Name:");
		lastName = s1.nextLine();
		contact.setLastName(lastName);

		System.out.println("\nEnter Email" + ":");
		email = s1.nextLine();
		contact.setEmail(email);
		contactList.add(contact);
	}

	private static void display(ContactStore store) throws Exception {
		List<Contact> contacts = store.retrieve();
		System.out.println("size:" + contacts.size());
		for (int i = 0; i < contacts.size(); i++) {
			System.out.println("FirstName:" + contacts.get(i).getFirstName());
			System.out.println("LastName:" + contacts.get(i).getLastName());
			System.out.println("Email:" + contacts.get(i).getEmail());

		}
	}

}
