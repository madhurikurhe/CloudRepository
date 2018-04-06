package com.techlabs.contact;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ContactStore {
	private String fileName;
	private static final String COMMA_DELIMITER = ",";
	public ContactStore(String fileName) {
		this.fileName = fileName;
	}

	public List<Contact> retrieve() throws Exception {
		File f = new File(fileName);
		if(f.exists()){
		FileInputStream fileIn = new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(fileIn);
		@SuppressWarnings("unchecked")
		List<Contact> contactList = (List<Contact>) in.readObject();
		in.close();
		fileIn.close();
		return contactList;
		}
		return new ArrayList<Contact>();
		
	}

	public void save(List<Contact> contactList) throws Exception {

		FileOutputStream fileOut = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(contactList);
		out.close();
		fileOut.close();
		System.out.println("\nSerialization Successful\n");

	}
	void export(List<Contact> contactList) throws IOException {
		FileWriter fileWriter = null;
		fileWriter = new FileWriter("Contact.csv");
		BufferedWriter out = new BufferedWriter(
				new FileWriter("D:\\CloudRepository\\CoreJava\\OOP\\contact-serialization-app\\Contact.csv"));
		for (int i = 0; i < contactList.size(); i++) {
			out.write( contactList.get(i).getFirstName());
			out.write(COMMA_DELIMITER);
			out.write(contactList.get(i).getLastName());
			out.write(COMMA_DELIMITER);
			out.write(contactList.get(i).getEmail());
			out.newLine();

		}

		out.close();
		System.out.println("Write to CSV file Succeeded!!!");
		fileWriter.close();
	}
}
