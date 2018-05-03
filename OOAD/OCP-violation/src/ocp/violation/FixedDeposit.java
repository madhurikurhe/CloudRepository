package ocp.violation;

public class FixedDeposit {
	private String name;
	private double principal;
	private int years;
	private FestivalType fesival;

	public FixedDeposit(String name, double principal, int years,
			FestivalType fesival) {
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.fesival = fesival;
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

	public FestivalType getFesival() {
		return fesival;
	}

	public void setFesival(FestivalType fesival) {
		this.fesival = fesival;
	}

	private int findRate() {
		int rate = 0;
		if (getFesival() == FestivalType.HOLI)
			rate = 8;
		else if (getFesival() == FestivalType.NEWYEAR)
			rate = 9;
		else
			rate = 7;
		return rate;

	}

	public double calculateInterest() {
		int rate = findRate();
		double interest = (getPrincipal() * rate * getYears()) / 100;
		return interest;

	}
}
