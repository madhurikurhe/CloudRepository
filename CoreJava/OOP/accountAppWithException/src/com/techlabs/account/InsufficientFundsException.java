package com.techlabs.account;

public class InsufficientFundsException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public InsufficientFundsException(Account account) {
		/*
		 * super( "Account holder " + account.getName() + " of Account No:" +
		 * account.getAccountNo() +
		 * " Does not have sufficient Balance. \nBalance:" +
		 * account.getBalance() + " Minimum balance must be Rs.500");
		 */
		 message="Account holder " + account.getName() + " of Account No:" +
				  account.getAccountNo() +
				  " Does not have sufficient Balance. \nBalance:" +
				  account.getBalance() + " Minimum balance must be Rs.500";
	}
	
	public String getMessage(){
		
		return message;
		
		
	}

}
