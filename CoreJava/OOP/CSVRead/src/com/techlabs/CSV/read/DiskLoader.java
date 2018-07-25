package com.techlabs.CSV.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DiskLoader implements ILoader {

	@Override
	public List<String> load() throws IOException {
		BufferedReader br = null;
		List<String> lines = new ArrayList<>();
		String line = "";

		br = new BufferedReader(new FileReader("emp.txt"));

		while ((line = br.readLine()) != null) {
			lines.add(line);
		}

		br.close();
		//System.out.println(lines.size());
		return lines;
	}

}
