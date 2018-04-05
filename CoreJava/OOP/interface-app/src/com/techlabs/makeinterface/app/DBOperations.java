package com.techlabs.makeinterface.app;

public class DBOperations {

	public static void main(String[] args) {
		DBOperations operations=new DBOperations();
		DepartmentDB department = new DepartmentDB();
		InvoiceDB invoice = new InvoiceDB();
		CustomerDB customer = new CustomerDB();
		operations.doDBOperations(customer);
		operations.doDBOperations(invoice);
		operations.doDBOperations(department);
	}

	public void doDBOperations(Icrudable obj) {
		obj.create();
		obj.read();
		obj.update();
		obj.delete();
	}
}
