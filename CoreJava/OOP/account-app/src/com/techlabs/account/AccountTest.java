package com.techlabs.account;

public class AccountTest {
	public static void main(String[] args) {

		//caseStudy1();
		Account account1 = new Account(2000, "Madhuri", 1000);
		Account account2 = new Account(2001, "Trisha");
		Account account3 = new Account(2002, "Yadnya");
		Account account4 = new Account(2002, "Yadnya");
		System.out.println("No of Account holders:" +Account.headCount());

	}

	private static void caseStudy1() {
		Account account1 = new Account(2000, "Madhuri", 1000);
		Account account2 = new Account(2001, "Trisha");

		account1.whoIsRich(account2);
		if (account1.whoIsRich(account2) == account2)
			System.out.println("Trisha is reach than Madhuri");
		else
			System.out.println("Madhuri is reach than Trisha");

		printDetails(account1);
		System.out.println("\nMain balance:" + account1.getBalance());

		account1.withdraw(1000);
		System.out.println("Balance after withdrawal:" + account1.getBalance());

		account1.deposit(1000);
		System.out.println("Balance after deposit:" + account1.getBalance());

		printDetails(account2);
		System.out.println("Main balance:" + account2.getBalance());

		account2.withdraw(400);
		System.out.println("Balance after withdrawal:" + account2.getBalance());

		account2.deposit(1000);
		System.out.println("Balance after deposit:" + account2.getBalance());
	}

	public static void printDetails(Account account) {

		System.out.println("\nAccount Holder Name:" + account.getName());
		System.out.println("Account No:" + account.getAccountNo());
		// System.out.println("Main Balance:" + account.getBalance());

	}
}