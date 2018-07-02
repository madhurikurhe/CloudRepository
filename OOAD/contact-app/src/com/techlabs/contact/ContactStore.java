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
	private static final String COMMA_DELIMITER = ",";

	private static final String NEW_LINE_SEPARATOR = "\n";
	private static String filename;

	public ContactStore(String filename) {
		this.filename = filename;
	}

	public void save(List<Contact> contactList) throws IOException {
		FileOutputStream fout = new FileOutputStream(filename);
		ObjectOutputStream obout = new ObjectOutputStream(fout);
		obout.writeObject(contactList);
		// obout.flush();
		obout.close();
		fout.close();
		System.out.println("Serialization successfull");

	}

	public List<Contact> retrive() throws Exception {
		File f = new File(filename);
		if (f.exists()) {
			FileInputStream fin = new FileInputStream(filename);
			ObjectInputStream obin = new ObjectInputStream(fin);
			List<Contact> contactList = (List<Contact>) obin.readObject();
			obin.close();
			fin.close();

			return contactList;
		}
		return new ArrayList<Contact>();

	}

	public void conatactCsv(List<Contact> contactList) throws IOException {
		FileWriter fwrite = null; // new FileWriter("contact.csv");
		fwrite = new FileWriter("contact.csv");
		BufferedWriter bwrite = new BufferedWriter(new FileWriter(
				"D:\\CloudRepository\\CoreJava\\OOAD\\"
						+ "contact-app\\contact.csv"));
		for (Contact contact : contactList) {
			fwrite.append(contact.getFname());
			fwrite.append(COMMA_DELIMITER);
			fwrite.append(contact.getLname());
			fwrite.append(COMMA_DELIMITER);
			fwrite.append(contact.getEmail());
			fwrite.append(NEW_LINE_SEPARATOR);
		}
		System.out.println("csv file created");
		fwrite.flush();
		fwrite.close();

	}

}
