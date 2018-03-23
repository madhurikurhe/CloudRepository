package com.techlabs.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FileTest {
	public static void main(String args[]) throws IOException {
		try {
			FileOutputStream fo = new FileOutputStream("prog2.txt");
			String s1 = "Welcome to techlabs";
			byte b1[] = s1.getBytes();
			fo.write(b1);
			fo.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not  found");
			e.printStackTrace();
		}

		  FileInputStream fi = new FileInputStream("prog2.txt");
		
		  BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		  String s = b.readLine();      
		  System.out.println(s);
/*
		
		int n = 0;
		try {
			while ((n = fi.read()) != -1) {
				System.out.println((char) n);
			}
			fi.close();
		} catch (IOException e) {
			System.out.println("Error in opening file");
			e.printStackTrace();
		}
*/
	}
}
