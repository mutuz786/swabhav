package com.techlabs.model;

public class Manager extends Employee{
	double hra=basicSalary*50/100;
	double ta=basicSalary*40/100;
	double da=basicSalary*30/100;
	
	public Manager(int id, String name, String gender, int basicSalary) {
		super(id, name, gender, basicSalary);
	}

	@Override
	String getAllowancesDetails() {
		return "hra:"+hra+"\nta"+ta+"\nda:"+da;
	}

	@Override
	protected double getTotalAllowances() {
		return hra+ta+da;
	}
	
	@Override
	public String toString() {
		return "Manager";
	}

}
