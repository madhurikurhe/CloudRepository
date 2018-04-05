package com.techlabs.propertyFile;

import java.io.FileReader;
import java.util.Properties;

public class PropertyFileRead {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("user.properties");

		Properties properties = new Properties();
		properties.load(reader);

		System.out.println(properties.getProperty("user"));
		System.out.println(properties.getProperty("password"));
	}
}
 