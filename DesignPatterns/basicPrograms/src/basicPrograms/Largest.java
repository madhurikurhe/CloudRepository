package basicPrograms;

public class Largest {
	public static void main (String args[]) {
		
		int firstNumber = 4;
		int secondNumber = 6;
		int thirdNumber= 7;
		
		if (firstNumber>secondNumber && firstNumber>thirdNumber)
		{
			System.out.println ("The largest number is " +firstNumber);
		}
		
		else if (secondNumber>firstNumber && secondNumber>thirdNumber)
		{
			System.out.println ("The largest number is " + secondNumber);
			
		}
		
		else 
		{
			System.out.println ("The largest number is " + thirdNumber);
			
		}

	
}

}