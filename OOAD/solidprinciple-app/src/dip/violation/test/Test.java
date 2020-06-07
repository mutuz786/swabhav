package dip.violation.test;

import dip.violation.*;

public class Test {
	public static void main(String[] args) {
		TaxCalculator calc=new TaxCalculator(LogType.JSON);
		System.out.println(calc.calculateTax(10, 5));
		System.out.println(calc.calculateTax(0, 0));
	}
}
