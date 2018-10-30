package com.techlabs.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.techlabs.sample.bank.model.TransactionService;

public class TestFilter {
	public static void main(String[] args) throws ParseException {
		TransactionService service = new TransactionService();
		String sdate = "2018/10/23";
		String edate = "2018/10/25";
		java.util.Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(sdate);
		java.util.Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(edate);

		System.out.println(date1 + "\t" + date2);

		service.getFilteredTransactions(date1, date2);
	}
}
