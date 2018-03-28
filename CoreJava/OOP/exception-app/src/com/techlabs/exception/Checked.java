package com.techlabs.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked {
	public void checkedException() throws IOException {
		FileInputStream input = null;
		new FileInputStream("C:/myfile.txt");
		input.close();

	}
}
