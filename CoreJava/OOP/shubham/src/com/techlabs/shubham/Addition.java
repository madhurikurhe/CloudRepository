package com.techlabs.shubham;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int array[] = new int[5];
		System.out.println("Enter how many numbers u want to add:");
		int N = s.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Enter number:");
			array[i] = s.nextInt();
		}

	
			for (int a : array) {
				while (a != 0) {
					sum = sum + (a % 10);
					a = a / 10;
				}
				System.out.println(sum);
				sum = 0;
			}
		}
	}
