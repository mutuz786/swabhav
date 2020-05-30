package ocp.solution2.test;

import ocp.solution2.*;

public class SolutionTest {
	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(101, "Murtaza", 100000, 10, new Ramzan());
		System.out.println("rate:" + fd.calculateRate() + "\ntotal interest:" + fd.calculateSimpleInterest());
	}
}
