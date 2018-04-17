package com.techlabs.shoppingCart.test;

import com.techlabs.shoppingCart.LineItem;
import com.techlabs.shoppingCart.Product;

public class TestLineItem {
	public static void main(String[] args) {

		LineItem item = new LineItem(1, 5, new Product(1, "Laptop", 300, 10));
		double cost = item.totalLineItemCost();
		System.out.println("Total Line Item Cost:" + cost);
	}

}
