package com.techlabs.compositeDemo;

public class CompanyDriver {
	public static void main(String[] args) {
		Manager manager1=new Manager(101,"Madhu");
		Manager manager2=new Manager(102,"Trisha");
		
		CompanyDirectory directory=new CompanyDirectory();
		directory.addEmployee(manager1);
		directory.addEmployee(manager2);
		
		Developer developer1=new Developer(103,"Prasad");
		Developer developer2=new Developer(104,"Vivek");
		
		CompanyDirectory dir2=new CompanyDirectory();
		dir2.addEmployee(developer1);
		dir2.addEmployee(developer2);
		
		CompanyDirectory dir=new CompanyDirectory();
		dir.addEmployee(directory);
		dir.addEmployee(dir2);
		
		dir.showEmployeeDetails();
	}
}
