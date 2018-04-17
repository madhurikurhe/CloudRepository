package com.techlabs.shoppingCart.test;

import com.techlabs.shoppingCart.LineItem;
import com.techlabs.shoppingCart.Order;
import com.techlabs.shoppingCart.Product;

public class TestOrder {
	public static void main(String[] args) {
		Order order = new Order();
		order.addToCart(new LineItem(1, 5, new Product(1, "Laptop", 300, 10)));
		order.addToCart(new LineItem(2, 5, new Product(2, "Mouse", 300, 10)));
		order.addToCart(new LineItem(3, 5, new Product(3, "Keyboard", 300, 10)));
		
		System.out.println("No of Line items in Cart:" +order.getOrderItems().size());
		order.remove(new LineItem(1, 5, new Product(1, "Laptop", 300, 10)));
		System.out.println("CheckOutPrice:" + order.checkOutPrice());
	}
}
