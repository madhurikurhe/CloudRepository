package com.techlabs.account2;

public class AccountTest {
	public static void main(String args[]) {
		Account acc1 = new Account(6000, "Madhuri");
		Account acc2 = new Account(8000, "Prasad");
		acc1.whoIsrich(acc2);
		if (acc1.whoIsrich(acc2) == acc2)
			System.out.println("Prasad is reach than Madhuri \n Balance is:"
					+ acc2.getBalance());
		else
			System.out.println("Madhuri is reach than Prasad \n Balance is:"
					+ acc1.getBalance());

	}
}
