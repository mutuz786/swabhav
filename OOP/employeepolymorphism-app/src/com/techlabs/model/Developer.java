package com.techlabs.model;

public class Developer extends Employee{
	double pa=basicSalary*40/100;
	double bonus=basicSalary*30/100;
	
	public Developer(int id, String name, String gender, int basicSalary) {
		super(id, name, gender, basicSalary);
	}

	@Override
	String getAllowancesDetails() {
		return "pa:"+pa+"\nbonus:"+bonus;
	}

	@Override
	protected double getTotalAllowances() {
		return pa+bonus;
	}

}
