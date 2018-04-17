package com.techlabs.shoppingCart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class OrderHistoryReport {

	public void printOrderReport(Customer customer) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("1992-07-26");
		Date date1 = sdf.parse("2018-07-24");

		Order order = new Order(date);
		order.addToCart(new LineItem(1, 5, new Product(1, "Laptop", 300, 10)));
		order.addToCart(new LineItem(2, 5, new Product(2, "Mouse", 300, 10)));
		order.addToCart(new LineItem(3, 5, new Product(3, "Keyboard", 300, 10)));

		Order order1 = new Order(date1);
		order1.addToCart(new LineItem(4, 5, new Product(4, "Scanner", 300, 10)));
		order1.addToCart(new LineItem(5, 5, new Product(5, "Pendrive", 300, 10)));
		order1.addToCart(new LineItem(6, 5, new Product(6, "Printer", 300, 10)));

		caseStudy1(customer, order);

		caseStudy1(customer, order1);

	}

	private static void caseStudy1(Customer customer, Order order) {
		List<LineItem> orderItems;
		orderItems = order.getOrderItems();

		System.out.println("Customer Name:" + customer.getName());
		System.out.println("\nDate:" + order.getDate());

		System.out.println("\nTotal items in Cart:"
				+ order.getOrderItems().size());

		for (LineItem l : orderItems) {
			System.out.println("Order Name:" + l.getProduct().getName()
					+ " Quantity:" + l.getQuantity());

		}
		System.out.println("\nTotal Cost:" + order.checkOutPrice());
	}

}
