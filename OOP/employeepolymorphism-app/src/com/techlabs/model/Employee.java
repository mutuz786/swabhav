package com.techlabs.model;

public abstract class Employee {
	private int id;
	private String name;
	private String gender;
	protected int basicSalary;
	
	public Employee(int id,String name,String gender,int basicSalary){
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.basicSalary=basicSalary;
	}
	
	public double calculateNetSalary(){
		return (basicSalary+getTotalAllowances())*12;
		
	}

	protected abstract double getTotalAllowances();

	abstract String getAllowancesDetails();
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public double getbasicsalary() {
		return basicSalary;
	}
	
	public String getAllowances() {
		return getAllowancesDetails();
	}
	
	
}
