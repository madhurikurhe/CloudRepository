package com.techlabs.contact.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.contact.Contact;
import com.techlabs.contact.ContactStore;

public class ContactStoreTest {

	public static void main(String[] args) throws Exception {

		//testSave();
	    testRetrieve();
	}

	private static void testSave() throws Exception {
		ContactStore cs = new ContactStore("contact.txt");
		Contact contact = new Contact();
		List<Contact> contactList = new ArrayList<Contact>();


	
		contact.setLastName("Unde");
		contact.setEmail("Madhu");
		contact.setFirstName("Madhu");
		contactList.add(contact);
		cs.save(contactList);
		int i = contactList.size();
		System.out.println("Size of Array:" + i);
		System.out.println("Save test case passed");
	}

	private static void testRetrieve() throws Exception {
		ContactStore cs = new ContactStore("contact.txt");
		List<Contact> contacts = cs.retrieve();

		int expectedSize =1;
		if (contacts.size() == expectedSize)
			System.out.println("Retrieve test case passed");
		else
			System.out.println("Retrieve test case not passed");
	}
}
