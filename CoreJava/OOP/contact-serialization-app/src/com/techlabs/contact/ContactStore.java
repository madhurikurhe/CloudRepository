package com.techlabs.contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ContactStore {
	private String fileName;

	public ContactStore(String fileName) {
		this.fileName = fileName;
	}

	public List<Contact> retrieve() throws Exception {
		FileInputStream fileIn = new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(fileIn);
		System.out.println("Deserialization Successful\n");
		List<Contact> contacts = (List<Contact>) in.readObject();
		in.close();
		fileIn.close();
		return contacts;

	}

	public void save(List<Contact> contactList) throws Exception {

		FileOutputStream fileOut = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(contactList);
		out.close();
		fileOut.close();
		System.out.println("\nSerialization Successful\n");

	}
}
