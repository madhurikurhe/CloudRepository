package com.techlabs.CSV.read;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class HierarchyBuilder {
	public static void main(String[] args) throws IOException {
		DiskLoader disk = new DiskLoader();
		Parser parser = new Parser(disk);
		TreeSet<Employee> emp = parser.getRecords();
		int id = 0;
		for (Employee e : emp) {
			System.out.println(e.getName());
		}

		for (Employee e : emp) {
			if (e.getManagerId() == 0) {
				id = e.getId();
				System.out.println(e.getName());
			}
		}
		for (Employee e : emp) {
			if (e.getManagerId() == id) {
				System.out.print("\t");
				System.out.println(e.getName());

				for (Employee m : emp) {
					if (e.getId() == m.getManagerId()) {
						System.out.print("\t\t");
						System.out.println(m.getName());
					
						for(Employee k:emp){
							if(m.getId()==k.getManagerId()){
								System.out.print("\t\t\t");
								System.out.println(k.getName());
							}
						}
					}
				}
			}
		}

	}

}
