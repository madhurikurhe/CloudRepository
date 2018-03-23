package com.techlabs.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
	private static final String FILENAME = "D:\\CloudRepository\\CoreJava\\OOP\\fileHandling\\prog.txt";

	public void write() {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

			String content = "Welcome to swabhav techlabs";

			bw.write(content);

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	public void read() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(FILENAME));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
