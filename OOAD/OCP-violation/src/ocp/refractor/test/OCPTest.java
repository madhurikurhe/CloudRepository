package ocp.refractor.test;

import ocp.refractor.FixedDeposit;
import ocp.refractor.HoliFestival;
import ocp.refractor.NewYearFestival;
import ocp.refractor.Normal;

public class OCPTest {
	public static void main(String[] args) {
		HoliFestival holi = new HoliFestival();
		NewYearFestival ny = new NewYearFestival();
		Normal normal = new Normal();

		FixedDeposit fd = new FixedDeposit("Madhu", 1000, 3,holi);
		FixedDeposit fd1 = new FixedDeposit("Madhu", 1000, 3,ny);
		FixedDeposit fd2 = new FixedDeposit("Madhu", 1000, 3,normal);
		
		double interest = fd.calculateInterest();
		double interest1 = fd1.calculateInterest();
		double interest2 = fd2.calculateInterest();
		
		

		System.out.println("Interest for holi festival:" + interest);
		System.out.println("Interest for new year festival:" + interest1);
		System.out.println("Normal Interest :" + interest2);
		
	}
}
