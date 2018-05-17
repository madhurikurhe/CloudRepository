package com.techlabs.strategy.test;

import com.techlabs.strategy.Context;
import com.techlabs.strategy.DoAddition;
import com.techlabs.strategy.DoMultiplication;
import com.techlabs.strategy.DoSubtraction;

public class strategyTest {
	public static void main(String[] args) {
		Context context=new Context(new DoAddition());
		int result=context.executeStrategy(10, 20);
		System.out.println("Addition is:" +result);
	
		context=new Context(new DoMultiplication());
		int result1=context.executeStrategy(10, 20);
		System.out.println("Multiplication is:" +result1);
		
		context=new Context(new DoSubtraction());
		int result2=context.executeStrategy(20, 10);
		System.out.println("Subtraction is:" +result2);
	}
}

