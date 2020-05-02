package com.techlabs.enggineeringcollegedb;

public class Student {
	private Branch branch;
	private Person person;

	public Student(Branch branch, Person person) {
		this.branch = branch;
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}
	
	public String getBranch() {
		return branch.name().toLowerCase();
	}
}
