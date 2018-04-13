package com.techlabs.account;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountJUnitTest {

	@Test(expected = InsufficientFundsException.class)

	public void testWithdraw() throws InsufficientFundsException {
		Account account = new Account(1001, "Madhu");
		int amount=3000;
		account.withdraw(amount);
		assertTrue(account.getBalance()>1000);

	}

}
