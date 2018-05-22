package com.techlabs.decoratorDemo;

public class ChineesFood extends FoodDecorator{

	public ChineesFood(IFood newFood) {
		super(newFood);
	}

	public String prepareFood(){  
        return super.prepareFood() +" Chinees food ";   
    }  
    public int foodPrice()   {  
        return super.foodPrice()+50;  
    }  

}
