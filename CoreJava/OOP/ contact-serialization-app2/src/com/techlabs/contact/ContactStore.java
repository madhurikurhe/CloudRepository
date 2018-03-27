package com.techlabs.contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ContactStore {
	public static String deserialize(String fileName) throws Exception {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		String obj =  (String) ois.readObject();
		ois.close();
		return obj;
	}

	public Object serialize(Object obj, String fileName) throws Exception {
		
		return  obj;
	}

}

