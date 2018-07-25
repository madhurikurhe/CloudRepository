package com.techlabs.serialization;



import java.util.Scanner;

public class SerializationTest {

	public static void main(String[] args) throws Exception {
		String fileName = "employee.ser";
		Employee[] emp = new Employee[3];
		//Employee emp = new Employee();
		//emp.setFirstName("Madhu");
		//emp.setLastName("Unde");
		//emp.setEmail("madhu@gmail.com");

int index=0;
		emp[index] = new Employee();
		Scanner s1 = new Scanner(System.in);
		System.out.println("\nEnter First Name:");
		String firstName = s1.nextLine();
		emp[index].setFirstName(firstName);
		Serialization.serialize(emp, fileName);

//		Employee empNew = null;

	Employee empNew = (Employee) Serialization.deserialize(fileName);

		System.out.println("Firstname Before Serialization::" + emp[0].getFirstName());
		//System.out.println("Last name Before Serialization::" + emp.getLastName());
		//System.out.println("email Before Serialization::" + emp.getEmail());
		
		System.out.println("Firstname After Serialization::" + empNew);
	}
}
