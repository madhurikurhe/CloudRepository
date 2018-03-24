package com.techlabs.serialization;

public class SerializationTest {

	public static void main(String[] args) throws Exception {
		String fileName = "employee.ser";
		Employee emp = new Employee();
		emp.setAge(50);

		Serialization.serialize(emp, fileName);

		Employee empNew = null;

		empNew = (Employee) Serialization.deserialize(fileName);

		System.out.println("Age Before Serialization::" + emp);
		System.out.println("Age After Serialization::" + empNew);
	}
}
