package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxCalculator;

public class DIPTest {
	public static void main(String[] args) {

		TaxCalculator tax = new TaxCalculator(LogType.XML);
		tax.calculate(10, 0);
		TaxCalculator tax1 = new TaxCalculator(LogType.EMAIL);
		tax1.calculate(10, 0);
	}
}
