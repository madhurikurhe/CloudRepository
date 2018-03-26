package com.techlabs.contact;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//import com.techlabs.employee.Employee;

public class ContactTest {
	static int i = 0;
	private static final String COMMA_DELIMITER = ",";
	private static final String LINE_SEPARATOR = "\n";

	public static void main(String args[]) throws Exception {
		Contact[] contact = new Contact[3];
		Scanner s = new Scanner(System.in);
		int ch;
		List contactList = new ArrayList();
		do {
			System.out.println("\n\tMENU");
			System.out.println("\t1.Display");
			System.out.println("\t2.Add");
			System.out.println("\t3.Export");
			System.out.println("\t4.Exit");
			System.out.println("\tEnter Your Choice:");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				for (int index = 0; index < i; index++) {
					contact[index].display();
				}
				break;
			case 2:

				contact[i] = new Contact();
				contact[i].add();
				contactList.add(contact[i]);
				i++;
				System.out.println("i:" + i);
				break;
			case 3:
				FileWriter fileWriter = null;
				fileWriter = new FileWriter("Contact.csv");
				Iterator it = contactList.iterator();
				while (it.hasNext()) {
					Contact e = (Contact) it.next();
					fileWriter.append(e.getFirstName());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(e.getLastName());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(e.getEmail());
					fileWriter.append(LINE_SEPARATOR);
				}
				System.out.println("Write to CSV file Succeeded!!!");
				fileWriter.close();

				break;
			}
		} while (ch != 3);
	}
}
