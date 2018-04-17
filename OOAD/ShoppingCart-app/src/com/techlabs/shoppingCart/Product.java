package com.techlabs.shoppingCart;

public class Product {
	private int productID;
	private String name;
	private double cost;
	private float discount;

	public Product(int productID, String name, double cost, float discount) {
		this.productID = productID;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public double calculateCostAfterDiscount() {
		double discount=(getCost()*getDiscount())/100;
		cost=getCost()-discount;
		return this.cost;

	}
}
