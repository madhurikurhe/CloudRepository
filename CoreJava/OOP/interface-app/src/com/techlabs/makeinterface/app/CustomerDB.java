package com.techlabs.makeinterface.app;

public class CustomerDB implements Icrudable {

	@Override
	public void create() {
		System.out.println("Customer added");
	}

	@Override
	public void read() {
		System.out.println("Customer read");
	}

	@Override
	public void update() {
		System.out.println("Customer updated");
	}

	@Override
	public void delete() {
		System.out.println("Customer deleted");
	}

}
