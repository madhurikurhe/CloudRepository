package com.techlabs.contact;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//import com.techlabs.serialization.Serialization;

public class ContactStoreTest implements Serializable{
	String fname;
	String lname;
	String email;

	public ContactStoreTest(String firstname, String lastname, String email) {
		this.fname = firstname;
		this.lname = lastname;
		this.email = email;

	}


	public static void main(String args[]) throws Exception {
		String fileName = "employee.ser";
		//ContactStore cs = new ContactStore();
		ContactStoreTest cst = new ContactStoreTest("madhu", "unde", "madhu");
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cst);
		fos.close();
		oos.close();
		System.out.println("Data Serialized");

	}
}
