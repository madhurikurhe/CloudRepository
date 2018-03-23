package com.techlabs.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
	private static final String FILENAME = "D:\\CloudRepository\\CoreJava\\OOP\\fileHandling\\prog.txt";

	public void writeFile() throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME));
		String content = "Welcome to swabhav techlabs";
		bw.write(content);
		bw.close();

	}

	public void readFile() throws IOException {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(FILENAME));
		String Line = br.readLine();
		while (Line != null) {
			System.out.println(Line);
			Line = br.readLine();
		}

		br.close();
	}

}
