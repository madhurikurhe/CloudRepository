package com.techlabs.rto;



import java.util.Map;
import java.util.Scanner;

public class TestRto {

	private static final int DISPLAY_ALL = 1;
	private static final int SEARCH = 2;
	private static final int EXIT = 3;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Database database = new Database();
		Map<String, String> map = database.readPropertiesFile();

		for (int count = 1; count < 100; count++) {
			displayBasicInfo();
			int value = sc.nextInt();
			switch (value) {
			case DISPLAY_ALL:
				DisplayAllData.displayAll(map);
				break;

			case SEARCH:
				System.out.println("Enter State name= ");
				String name = sc.next();
				Search code = new Search();
				code.searchCode(name, map);
				System.out.println(" ");
				break;

			case EXIT:
				System.exit(0);
				break;

			default:
				System.out.println("Enter valid number.");
			}
		}
	}

	public static void displayBasicInfo() {
		System.out.println("Enter the value");
		System.out.println("1) Display All");
		System.out.println("2) Search");
		System.out.println("3) Exit");
	}

}
