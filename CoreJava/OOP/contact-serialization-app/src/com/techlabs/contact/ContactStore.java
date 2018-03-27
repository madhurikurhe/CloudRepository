package com.techlabs.contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ContactStore {
	public static Contact[] deserialize(String fileName) throws Exception {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Contact[] obj = (Contact[]) ois.readObject();
		ois.close();
		return obj;
	}

	public Contact serialize(Object obj, String fileName) throws Exception {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
		return (Contact) obj;
	}

}

