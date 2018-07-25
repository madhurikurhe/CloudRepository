package com.techlabs.mutable;

public class TestMutableArray {
	public static void main(String[] args) {
		int[] mutateMarks = { 10, 10, 10, 10, 10 };
		int k=100;
		changeMarks(mutateMarks,k);
		
		for (int marks : mutateMarks) {
			System.out.println(" " + marks);
			System.out.println(k );
		}
	}

	private static void changeMarks(int[] mutateMarks,int k) {

		for (int index = 0; index < mutateMarks.length; index++) {
			mutateMarks[index] = 40;
			k=0;

		}
	}
}
