package com.techlabs.contact.test;

import com.techlabs.contact.Contact;

public class ContactTest {
	public static void main(String args[]) {

		testConstructor();

		testGetters();
	}

	private static void testGetters() {
		Contact contact = new Contact();
		contact.setFirstName("Trisha");
		contact.setLastName("Kurhe");
		contact.setEmail("Trisha");

		System.out.println("FirstName:" + contact.getFirstName());
		System.out.println("LastName:" + contact.getLastName());
		System.out.println("Email:" + contact.getEmail());

	}

	private static void testConstructor() {
		Contact contact = new Contact("Madhu", "Unde", "Madhu");
		System.out.println("FirstName:" + contact.getFirstName());
		System.out.println("LastName:" + contact.getLastName());
		System.out.println("Email:" + contact.getEmail());

	}
}