package com.techlabs.shoppingCart.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.techlabs.shoppingCart.Customer;
import com.techlabs.shoppingCart.LineItem;
import com.techlabs.shoppingCart.Order;
import com.techlabs.shoppingCart.Product;

public class TestCustomer {

	public static void main(String[] args) throws ParseException {
		List<LineItem> orderItems = new ArrayList<LineItem>();
		Order order = new Order();
		order.addToCart(new LineItem(1, 5, new Product(1, "Laptop", 300, 10)));
		order.addToCart(new LineItem(2, 5, new Product(2, "Mouse", 300, 10)));
		order.addToCart(new LineItem(3, 5, new Product(3, "Keyboard", 300, 10)));

		System.out.println("No of Line items in Cart:"
				+ order.getOrderItems().size());

		orderItems = order.getOrderItems();

		Customer customer = new Customer("Madhu");
		for (LineItem l : orderItems) {
			System.out.println("Order Name:" + l.getProduct().getName()
					+ " Quantity:" + l.getQuantity());
		}



		customer.addOrder(new LineItem(4, 5,
				new Product(4, "Scanner", 300, 10)), orderItems);
		System.out.println("\nNo of Line items in Cart:"
				+ order.getOrderItems().size());
	
		for (LineItem l : orderItems) {
			System.out.println("Order Name:" + l.getProduct().getName()
					+ " Quantity:" + l.getQuantity());
		}
	}
}
