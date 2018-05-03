package com.techlabs.CSV.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class URLLoader implements ILoader {

	@Override
	public List<String> load() throws IOException {
		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
		List<String> lines = new ArrayList<String>();
		URLConnection connection = url.openConnection();
		InputStreamReader input = new InputStreamReader(
				connection.getInputStream());
		BufferedReader buffer = null;
		String line = "";

		buffer = new BufferedReader(input);
		while ((line = buffer.readLine()) != null) {
			lines.add(line);
		}

		if (buffer != null) {
			buffer.close();
		}

		return lines;
	}

}
