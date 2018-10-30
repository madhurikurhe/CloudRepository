package com.techlabs.sample.bank.model;

import java.sql.Date;
import java.util.List;

import com.techlabs.sample.bank.exception.InsufficientBalanceException;
import com.techlabs.sample.bank.repository.BankDB;

public class TransactionService {
	private List<Transaction> transactions;
	private BankDB bankDB = new BankDB();

	public List<Transaction> getTransactions(String name) {
		transactions = bankDB.getTransactions(name);
		return transactions;
	}
	
	public List<Transaction> getFilteredTransactions(java.util.Date sdate,java.util.Date edate) {
		transactions = bankDB.getFilteredTransactions(sdate,edate);
		return transactions;
	}
	
	

	public void makeTransaction(Transaction txn) throws InsufficientBalanceException {
		bankDB.makeTransaction(txn);
	}

	public String getCSV(String name) {
		return bankDB.makeCSV(name);
	}
}
