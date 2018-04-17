package com.techlabs.shoppingCart.test;

import java.text.ParseException;

import com.techlabs.shoppingCart.Customer;
import com.techlabs.shoppingCart.OrderHistoryReport;

public class OrderHistoryReportTest {
	public static void main(String[] args) throws ParseException {
		Customer customer = new Customer("Madhu");

		OrderHistoryReport history=new OrderHistoryReport();
		history.printOrderReport(customer);
	}
}
