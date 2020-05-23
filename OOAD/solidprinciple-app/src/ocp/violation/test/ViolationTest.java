package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class ViolationTest {
	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(101, "Murtaza", 100000, 10, FestivalType.RAMZAN);
		System.out.println("rate:" + fd.calculateRate() + "\ntotal interest:" + fd.calculateSimpleInterest());
	}
}
