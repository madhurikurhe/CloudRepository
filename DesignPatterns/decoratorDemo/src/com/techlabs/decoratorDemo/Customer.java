package com.techlabs.decoratorDemo;

public class Customer {
	public static void main(String[] args) {
		VegFood vf=new VegFood();
		System.out.println(vf.prepareFood());
		System.out.println("Veg food Price:"+vf.foodPrice());
	
		IFood f1=new NonVegFood((IFood) new VegFood());  
		System.out.println(f1.prepareFood());
		System.out.println("NonVeg food Price:" +f1.foodPrice());
		
		IFood f2=new ChineesFood((IFood) new VegFood());  
		System.out.println(f2.prepareFood());
		System.out.println("Chinees food Price:"+f2.foodPrice());
			
	}
}
