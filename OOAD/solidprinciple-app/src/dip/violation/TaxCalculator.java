package dip.violation;

public class TaxCalculator {
	LogType log;

	public TaxCalculator(LogType log) {
		this.log = log;
	}

	public int calculateTax(int amount, int rate) {
		int result;
		try {
			result = amount / rate;
		} catch (RuntimeException ex) {
			switch (log) {
			case JSON:
				new JSONLogger().log(ex.getMessage());
				break;
			case TXT:
				new TXTLogger().log(ex.getMessage());
				break;
			case XML:
				new XMLLogger().log(ex.getMessage());
				break;
			default:
				break;

			}
			return -1;
		}
		return result;
	}
}
