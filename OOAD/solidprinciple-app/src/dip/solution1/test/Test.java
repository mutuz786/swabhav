package dip.solution1.test;

import dip.solution1.*;

public class Test {
	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(new JSONLogger());
		System.out.println(calc.calculateTax(10, 5));
		System.out.println(calc.calculateTax(0, 0));
	}
}
