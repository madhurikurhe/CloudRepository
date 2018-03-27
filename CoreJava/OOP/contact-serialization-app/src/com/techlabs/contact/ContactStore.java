package com.techlabs.contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ContactStore {
	private String fileName;

	public ContactStore(String fileName) {
		this.fileName = fileName;
	}

	public Contact[] retrieve() throws Exception {
		FileInputStream fileIn = new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(fileIn);
		System.out.println("Deserialization Successful\n");
		Object obj = in.readObject();
		Contact[] contacts = (Contact[]) obj;
		in.close();
		fileIn.close();
		return contacts;

	}

	public void save(Contact[] contact) throws Exception {

		FileOutputStream fileOut = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(contact);
		out.close();
		fileOut.close();
		System.out.println("\nSerialization Successful\n");

	}
}
