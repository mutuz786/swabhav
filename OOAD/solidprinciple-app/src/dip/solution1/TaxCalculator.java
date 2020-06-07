package dip.solution1;

public class TaxCalculator {
	ILog log;

	public TaxCalculator(ILog log) {
		this.log = log;
	}

	public int calculateTax(int amount, int rate) {
		int result;
		try {
			result = amount / rate;
		} catch (RuntimeException ex) {
			log.log(ex.getMessage());
			return -1;
		}
		return result;
	}
}
