package com.techlabs.enggineeringcollegedb;

public class Professor {
	private double basicSalary;
	private double bonus;
	private Person person;

	public Professor(double basicSalary, double bonus, Person person) {
		this.basicSalary = basicSalary;
		this.bonus = bonus;
		this.person = person;
	}

	public double calculateSalary() {
		return (basicSalary * 12) + bonus;
	}

	public Person getPerson() {
		return person;
	}
}
