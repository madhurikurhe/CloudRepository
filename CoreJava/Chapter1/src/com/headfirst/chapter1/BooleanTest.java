
package com.headfirst.chapter1;
import java.util.Scanner;
public class BooleanTest {

	
	public static void main(String args[]) {

		 @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
	      System.out.print("Enter first number: ");
	      int firstNumber = s.nextInt();
	      System.out.print("Enter second number: ");
	      int secondNumber = s.nextInt();
	      
	      if(firstNumber>secondNumber)
	      {
	    	  System.out.print("First number is greater than second");
	      }
	      else if(secondNumber>firstNumber)
	      {
	    	  System.out.print("Second number is greater than first");
	      }
	      else
	    	  
	    	  
	      
	      System.out.println("Two numbers are equal ");
	}
}
