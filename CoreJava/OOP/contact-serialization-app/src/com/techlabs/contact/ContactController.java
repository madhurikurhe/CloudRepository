package com.techlabs.contact;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactController {
	private static final int DISPLAY = 1;
	private static final int ADD = 2;
	private static final int EXPORT = 3;
	private static final int EXIT = 4;
	private static int choice;
	private static String fileName = "contact.ser";
	private static List<Contact> contactList = new ArrayList<Contact>();
	private static ContactStore store = new ContactStore(fileName);
	public static void main(String args[]) throws Exception {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		 contactList = store.retrieve();
	    
		
		do {
			System.out.println("\n\tMENU(" +contactList.size() +")");
			System.out.println("\t1.Display");
			System.out.println("\t2.Add");
			System.out.println("\t3.Export");
			System.out.println("\t4.Exit");
			System.out.println("\tEnter Your Choice:");

			choice = scanner.nextInt();

			switchChoice(choice, contactList);

		} while (choice != EXIT);

	}

	private static void switchChoice(int choice, List<Contact> contact) throws Exception, IOException {

		switch (choice) {

		case DISPLAY:
			display();
			break;

		case ADD:
			add();
			break;
		case EXPORT:
			store.export(contactList);

			break;
		case EXIT:
			exit();
		}
	}

	private static void exit() throws Exception {
		store.save(contactList);
	}


	private static void add() throws Exception {
		String firstName;
		String lastName;
		String email;
		Contact contact = new Contact();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nEnter First Name:");
		firstName = scanner.nextLine();
		contact.setFirstName(firstName);

		System.out.println("\nEnter Last Name:");
		lastName = scanner.nextLine();
		contact.setLastName(lastName);

		System.out.println("\nEnter Email" + ":");
		email = scanner.nextLine();
		contact.setEmail(email);
		contactList.add(contact);

	}

	private static void display() throws Exception {
		System.out.println("\nFirstName \t\tLastName\t\tEmail");
		for (int i = 0; i < contactList.size(); i++) {
			System.out.print("\n" + contactList.get(i).getFirstName());
			System.out.print("\t\t\t" + contactList.get(i).getLastName());
			System.out.print("\t\t\t" + contactList.get(i).getEmail());

		}
	
	}

}
