package com.techlabs.makeinterface.app;

public class InvoiceDB implements Icrudable {

	@Override
	public void create() {
		System.out.println("Invoice added");
	}

	@Override
	public void read() {
		System.out.println("Invoice read");	
	}

	@Override
	public void update() {
		System.out.println("Invoice updated");
	}

	@Override
	public void delete() {
		System.out.println("Invoice deleted");
	}

}
