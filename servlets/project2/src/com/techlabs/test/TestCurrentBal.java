package com.techlabs.test;

import com.techlabs.sample.bank.repository.BankDB;

public class TestCurrentBal {
	public static void main(String[] args) {
		BankDB bank=new BankDB();
		double bal=bank.getCurrentBalance("madhu");
		System.out.println(bal);
	}
}
