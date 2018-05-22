package com.techlabs.decoratorDemo;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(IFood newFood) {
		super(newFood);
	}
	public String prepareFood(){  
        return super.prepareFood() +" non veg food ";   
    }  
    public int foodPrice()   {  
        return super.foodPrice()+150;  
    }  

}
