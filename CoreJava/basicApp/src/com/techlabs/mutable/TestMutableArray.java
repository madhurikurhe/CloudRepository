package com.techlabs.mutable;

public class TestMutableArray {
	public static void main(String[] args) {
		int[] mutateMarks = { 10, 10, 10, 10, 10 };
		changeMarks(mutateMarks);
		
		for (int marks : mutateMarks) {
			System.out.println(" " + marks);
		}
	}

	private static void changeMarks(int[] mutateMarks) {

		for (int index = 0; index < mutateMarks.length; index++) {
			mutateMarks[index] = 40;

		}
	}
}
