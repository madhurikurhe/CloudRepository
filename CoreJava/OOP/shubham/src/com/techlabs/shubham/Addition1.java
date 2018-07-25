package com.techlabs.shubham;

import java.util.HashMap;

public class Addition1 {
	static HashMap<Integer, Integer> hash1 = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		hash1.put(1, 6);
		hash1.put(3, 7);
		hash1.put(8, 8);
		hash1.put(6, 7);

		System.out.println("Total numbers:" +hash1.size());
		System.out.println("\nInput:");
		for (int k : hash1.keySet()) {
			System.out.print(k +" ");
			System.out.println(hash1.get(k));
		}

		System.out.println("\nOutput:");
		for (int k : hash1.keySet()) {
			int sum = k + hash1.get(k);
			System.out.println(sum);
		}

	};
}
