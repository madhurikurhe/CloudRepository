package com.techlabs.contact;

import java.util.Scanner;

public class ContactTest {
	static int i = 0;
	public static void main(String args[]) {
		Contact[] contact = new Contact[3];
		Scanner s = new Scanner(System.in);
		int ch;
	
		do {
			System.out.println("\n\tMENU");
			System.out.println("\t1.Display");
			System.out.println("\t2.Add");
			System.out.println("\t3.Exit");
			System.out.println("\tEnter Your Choice:");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				for(int index=0;index<i;index++){
				contact[index].display();
				}
				break;
			case 2:
				contact[i] = new Contact();
				contact[i].add();
				i++;
				System.out.println("i:" +i);
				break;

			}
		} while (ch != 3);
	}
}
