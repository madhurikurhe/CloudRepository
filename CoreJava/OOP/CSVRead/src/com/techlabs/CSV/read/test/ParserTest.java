package com.techlabs.CSV.read.test;

import java.io.IOException;
import java.util.TreeSet;

import com.techlabs.CSV.read.DiskLoader;
import com.techlabs.CSV.read.Employee;
import com.techlabs.CSV.read.Parser;
import com.techlabs.CSV.read.URLLoader;


public class ParserTest {
	public static void main(String[] args) throws IOException {
		URLLoader url=new URLLoader();
		DiskLoader disk=new DiskLoader();
		Parser parser=new Parser(url);
		System.out.println("File Loaded from URL");
		TreeSet<Employee>emp= parser.getRecords();
		for(Employee e:emp){
			System.out.print("\nEmployee Name:" +e.getName());
			System.out.print("  Employee Salary:" +e.getSalary());
		}
		
		Parser parser1=new Parser(disk);
		System.out.println("File loaded from Disk");
		TreeSet<Employee>emp1= parser1.getRecords();
		for(Employee e:emp1){
			System.out.print("\nEmployee Name:" +e.getName());
			System.out.print("  Employee Salary:" +e.getSalary());
		}
		
	}
}
