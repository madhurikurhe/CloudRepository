package com.techlabs.contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactTest {
	public static int choice;
	// public static Scanner scanner = new Scanner(System.in);
	static String filename = "contact.ser";
	static ContactStore store = new ContactStore(filename);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String fname, lname, email;

		// Contact contact = new Contact();

		List<Contact> contactList = new ArrayList<Contact>();
		contactList = store.retrive();
		System.out.println(contactList.size());
		do {
			System.out.println("Contact Menu ");
			System.out.println("1 : Add contact  ");
			System.out.println("2 : Display contact ");
			System.out.println("3 : Export ");
			System.out.println("4 : Exit");
			System.out.println("Enter your choice ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Contact contact = new Contact();

				System.out.println("Enetr First name");
				fname = scanner.next();
				System.out.println("Enter last name");
				lname = scanner.next();
				System.out.println("Enter email");
				email = scanner.next();

				contact.setFname(fname);
				contact.setLname(lname);
				contact.setEmail(email);
				contactList.add(contact);
				System.out.println("Contact added successfully");

				break;
			case 2:

				for (int i = 0; i < contactList.size(); i++) {
					System.out.println(contactList.get(i).getFname() + "  "
							+ contactList.get(i).getLname() + "  "
							+ contactList.get(i).getEmail());
				}
				break;
			case 3:
				store.conatactCsv(contactList);
				break;
			case 4:
				store.save(contactList);
				break;

			}

		} while (true);

	}

}
