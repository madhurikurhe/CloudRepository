package com.techlabs.file.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.TreeSet;

public class Main{

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
		URLConnection connection = url.openConnection();
		TreeSet<Integer> tree=new TreeSet<Integer>();
		TreeSet<String> designation=new TreeSet<String>();
		TreeSet<Integer>deptNo=new TreeSet<Integer>();
		InputStreamReader input = new InputStreamReader(
				connection.getInputStream());
		BufferedReader buffer = null;
		String line = "";
		String csvSplitBy = ",";

		try {

			buffer = new BufferedReader(input);
			while ((line = buffer.readLine()) != null) {
				String[] emp = line.split(csvSplitBy);
				//System.out.println(line);
				int sal=Integer.parseInt(emp[5]);
				//System.out.println("Salary:" +sal);
				tree.add(sal);
				designation.add(emp[2]);
				int dept=Integer.parseInt(emp[7]);
				deptNo.add(dept);
			}
			
			System.out.println("Maximum salary:" +tree.last());

			System.out.println("Total number of employees based on designation:" +designation.size());
			System.out.println("Total number of employees based on department:" +deptNo.size());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (buffer != null) {
				try {
					buffer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
