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

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		ContactStore store = new ContactStore(fileName);
		 contactList = store.retrieve();
	    
		
		do {
			System.out.println("\n\tMENU(" +contactList.size() +")");
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
			add(store);
			break;
		case EXPORT:
			store.export(contactList);

			break;
		case EXIT:
			exit(store);
		}
	}

	private static void exit(ContactStore store) throws Exception {
		store.save(contactList);
	}


	private static void add(ContactStore store) throws Exception {
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
		System.out.println("\nFirstName \t\tLastName\t\tEmail");
		for (int i = 0; i < contactList.size(); i++) {
			System.out.print("\n" + contactList.get(i).getFirstName());
			System.out.print("\t\t\t" + contactList.get(i).getLastName());
			System.out.print("\t\t\t" + contactList.get(i).getEmail());

		}
	
	}

}
