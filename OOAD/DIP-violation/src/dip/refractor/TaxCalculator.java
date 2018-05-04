package dip.refractor;

public class TaxCalculator {
	private ILogger logger;

	public TaxCalculator(ILogger logger) {
		this.logger = logger;
	}

	public int calculate(int salary, int hours) {
		int result = 0;
		try {
			result = salary / hours;
			System.out.println("REsult:" + result);

		} catch (Exception ex) {
			logger.log(ex.getMessage());

		}
		return result;
	}

}
