package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestToString {
	public static void main(String args[]) {
		Account acc1 = new Account(2000, "Madhuri", 1000);
		System.out.println(acc1);
		Account acc2 = new Account(2000, "Madhuri", 1000);
		System.out.println(acc1 == acc2);
		System.out.println(acc1.equals(acc2));

	}
}
