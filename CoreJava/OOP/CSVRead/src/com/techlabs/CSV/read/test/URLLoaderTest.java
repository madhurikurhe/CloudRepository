package com.techlabs.CSV.read.test;

import java.io.IOException;
import java.util.List;

import com.techlabs.CSV.read.URLLoader;

public class URLLoaderTest {
	public static void main(String[] args) throws IOException {
		URLLoader url=new URLLoader();
		List<String> line =url.load();
		for(String s:line){
			System.out.println(s);
		}
		System.out.println(line.size());
	}
}
