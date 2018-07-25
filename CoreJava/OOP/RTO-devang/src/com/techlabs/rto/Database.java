package com.techlabs.rto;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.TreeMap;

public class Database {

	public void writePropertiesFile() throws Exception {
		Properties p = new Properties();

		FileOutputStream fout = new FileOutputStream("D:\\CloudRepository\\CoreJava\\OOP\\RTO-devang\\rto.properties");
		ObjectOutputStream os = new ObjectOutputStream(fout);
		p.store(os, null);
		System.out.println("Successful");
	}

	public Map<String, String> readPropertiesFile() throws Exception {

		Map<String, String> map = new TreeMap<String, String>();
		Properties p = new Properties();
		FileInputStream fin = new FileInputStream("D:\\CloudRepository\\CoreJava\\OOP\\RTO-devang\\rto.properties");
		p.load(fin);

		for (Entry<Object, Object> entry : p.entrySet())
			map.put((String) entry.getKey(), (String) entry.getValue());
		return map;

	}
}
