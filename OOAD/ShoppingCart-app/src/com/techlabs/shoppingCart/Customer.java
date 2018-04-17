package com.techlabs.shoppingCart;

import java.util.List;

public class Customer {
	private String name;
	private List<LineItem> orders;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<LineItem> getOrders() {
		return orders;
	}

	public void setOrders(List<LineItem> orders) {
		this.orders = orders;
	}

	public List<LineItem> getOrder() {
		return orders;

	}

	public void addOrder(LineItem lineItem, List<LineItem> orderItems) {

		orderItems.add(lineItem);
	}
}
