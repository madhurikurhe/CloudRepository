package com.techlabs.CSV.read;

import java.io.IOException;
import java.util.TreeSet;

public class Analyzer  {
	public static void main(String[] args) throws IOException {

		URLLoader url = new URLLoader();
		Parser parser = new Parser(url);
		TreeSet<Employee> emp = parser.getRecords();

		for(Employee e:emp){
			System.out.println("Name:" +e.getName());
			System.out.println("Salary:" +e.getSalary());
		}
	}

	}
