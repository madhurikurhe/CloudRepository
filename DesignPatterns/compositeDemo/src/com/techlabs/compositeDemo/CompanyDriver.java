package com.techlabs.compositeDemo;

public class CompanyDriver {
	public static void main(String[] args) {
		Manager manager1=new Manager(101,"Madhu");
		Manager manager2=new Manager(102,"Trisha");
		
		CompanyDirectory directory1=new CompanyDirectory();
		directory1.addEmployee(manager1);
		directory1.addEmployee(manager2);
		
		Developer developer1=new Developer(103,"Prasad");
		Developer developer2=new Developer(104,"Vivek");
		
		CompanyDirectory directory2=new CompanyDirectory();
		directory2.addEmployee(developer1);
		directory2.addEmployee(developer2);
		
		CompanyDirectory directory=new CompanyDirectory();
		directory.addEmployee(directory1);
		directory.addEmployee(directory2);
		
		directory.showEmployeeDetails();
	}
}
