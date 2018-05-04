package dip.violation;

public class TaxCalculator {
	private LogType log;

	public TaxCalculator(LogType log) {
		this.log = log;
	}

	public int calculate(int salary, int hours) {
		int result = 0;
		try {
			result = salary / hours;

		} catch (Exception ex) {
			if (log == LogType.XML) {
				XMLLogger xml = new XMLLogger();
				xml.log(ex.getMessage());
			} else {
				EmailLogger email = new EmailLogger();
				email.log(ex.getMessage());
			}

		}
		return result;
	}
}
