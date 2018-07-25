package com.techlabs.contact;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactTest {

	public static void main(String args[]) throws Exception {
		List<Contact> ContactList = new ArrayList();
		ContactShare cont=new ContactShare();
		Contact con=new Contact();
		ContactList=cont.deserialize();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("MENU: \n1. Display\n2. Add\n3. Export\n4. Exit:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				display(ContactList);
				break;
			case 2:
				System.out.println("Enter the details of Contact:");
				System.out.println("Enter First Nme:");
				String fname = sc.next();
				con.setFname(fname);
				System.out.println("Enter Last Name:");
				String lname = sc.next();
				con.setLname(lname);
				System.out.println("Enter email:");
				String email = sc.next();
				con.setEmail(email);

				ContactList.add(con);
				System.out.println(ContactList.size());
				break;
			case 3:
				  new ContactShare().export(ContactList);
				break;
			case 4: 
				 new ContactShare().serialize(ContactList);
				 break;
			}

		} while (choice != 4);
		
		
		sc.close();

	}

	static void display(List<Contact> arrayObject) {
		for (int i = 0; i < arrayObject.size(); i++) {
			System.out.println((i + 1) + "Object of Array");
			System.out.println("First name:" + arrayObject.get(i).getfname());
			System.out.println("First name:" + arrayObject.get(i).getlname());
			System.out.println("First name:" + arrayObject.get(i).getemail());
		}
	}

}
