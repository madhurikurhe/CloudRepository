package com.techlabs.CSV.read;

import java.io.IOException;
import java.util.List;

public interface ILoader {
	public List<String> load() throws IOException;
}
