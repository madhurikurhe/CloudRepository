package com.techlabs.observer.test;

import com.techlabs.observer.Account;
import com.techlabs.observer.EmailListner;
import com.techlabs.observer.SMSListner;

public class ObserverTest {
	public static void main(String[] args) {
		SMSListner sms=new SMSListner();
		EmailListner email=new EmailListner();
		
		Account account=new Account(101, "Madhu", 1000);
		account.addListner(sms);
		account.addListner(email);
		
		account.withdraw(500);
		account.deposit(1000);
	
		
	
	}
}
