package dip.refractor.test;

import dip.refractor.EmailLogger;
import dip.refractor.TaxCalculator;
import dip.refractor.XMLLogger;

public class DIPRefractorTest {
	public static void main(String[] args) {
		EmailLogger email=new EmailLogger();
		XMLLogger xml=new XMLLogger();
		
		TaxCalculator tax = new TaxCalculator(email);
		tax.calculate(10, 0);
		TaxCalculator tax1 = new TaxCalculator(xml);
		tax1.calculate(10, 0);
	}
}
