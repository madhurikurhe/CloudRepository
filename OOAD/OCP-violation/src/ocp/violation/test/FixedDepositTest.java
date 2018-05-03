package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fd=new FixedDeposit("Madhu", 1000, 3, FestivalType.HOLI);
		double interest=fd.calculateInterest();
		System.out.println("Interest:" +interest);
		
	}
}
