package com.techlabs.model;

public class Analyst extends Employee{
	double perks=basicSalary=30/100;
	public Analyst(int id, String name, String gender, int basicSalary) {
		super(id, name, gender, basicSalary);
	}

	@Override
	String getAllowancesDetails() {
		return "perks:"+perks;
	}

	@Override
	protected double getTotalAllowances() {
		return perks;
	}
	
	@Override
	public String toString() {
		return "Analyst";
	}

}
