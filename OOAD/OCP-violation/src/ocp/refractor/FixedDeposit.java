package ocp.refractor;


public class FixedDeposit {
	private String name;
	private double principal;
	private int years;
	private IRateCalculator rate;

	public FixedDeposit(String name, double principal, int years, IRateCalculator rate) {
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.rate=rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double calculateInterest() {
		double interest = (getPrincipal() * rate.calculateRate() * getYears()) / 100;
		return interest;

	}
}
