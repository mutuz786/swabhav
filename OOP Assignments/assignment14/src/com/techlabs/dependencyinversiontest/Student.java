package com.techlabs.dependencyinversiontest;

public class Student {
	private PersonalData personalData;
	private double cgpa;

	public Student(PersonalData personalData, double cgpa) {
		this.personalData = personalData;
		this.cgpa = cgpa;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public double getCgpa() {
		return cgpa;
	}
}
