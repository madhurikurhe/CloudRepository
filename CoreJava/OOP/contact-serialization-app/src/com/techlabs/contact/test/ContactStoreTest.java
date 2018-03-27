package com.techlabs.contact.test;

import com.techlabs.contact.Contact;
import com.techlabs.contact.ContactStore;

public class ContactStoreTest {

	public static void main(String[] args) throws Exception {

		testSave();
		testRetrieve();
	}

	private static void testSave() throws Exception {
		ContactStore cs = new ContactStore("contact.txt");
		Contact[] contact = new Contact[3];
		for (int i = 0; i < contact.length; i++) {

			contact[i] = new Contact();
		}
		contact[0].setFirstName("Madhu");
		contact[0].setLastName("Unde");
		contact[0].setEmail("Madhu");

		contact[1].setFirstName("Madhu");
		contact[1].setLastName("Unde");
		contact[1].setEmail("Madhu");

		cs.save(contact);
		int i = contact.length;
		System.out.println("Size of Array:" + i);
		System.out.println("Save test case passed");
	}

	private static void testRetrieve() throws Exception {
		ContactStore cs = new ContactStore("contact.txt");
		Contact[] contacts= cs.retrieve();
		int expectedSize=3;
		if(contacts.length==expectedSize)	
		System.out.println("Retrieve test case passed");
		else
			System.out.println("Retrieve test case not passed");
	}
}
