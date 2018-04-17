package com.techlabs.shoppingCart;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Order {
	private Date date;
	private List<LineItem> orderItems=new ArrayList<LineItem>();
	
	
	public Order(Date date) {
		this.date = date;
	}

	public Order() {
	}
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void remove(LineItem LI){
		getOrderItems().remove(LI);
		orderItems.remove(LI);
	}
	
	public void addToCart(LineItem LI){
		orderItems.add(LI);
	}
	
	public double checkOutPrice(){
		Iterator<LineItem> i = orderItems.iterator();
	    double cost = 0;  
		while (i.hasNext()) {
	    	 cost=cost+ i.next().totalLineItemCost();
	      }
		return cost;
		
	}
	

	public List<LineItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<LineItem> orderItems) {
		this.orderItems = orderItems;
	}
}
