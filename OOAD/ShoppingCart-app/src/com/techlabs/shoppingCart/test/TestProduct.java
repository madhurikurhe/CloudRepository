package com.techlabs.shoppingCart.test;

import com.techlabs.shoppingCart.Product;

public class TestProduct {
	public static void main(String[] args) {
		Product product=new Product(1, "Laptop", 30000, 10);
		double cost=product.calculateCostAfterDiscount();
		System.out.println("Final Price after Discount:" +cost);
	}
}
