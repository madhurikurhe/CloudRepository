package com.techlabs.makeinterface.app;

public class DepartmentDB implements Icrudable {

	@Override
	public void create() {
		System.out.println("Department added");
	}

	@Override
	public void read() {
		System.out.println("Department read");
	}

	@Override
	public void update() {
		System.out.println("Department updated");
	}

	@Override
	public void delete() {
		System.out.println("Department delete");
	}

}
