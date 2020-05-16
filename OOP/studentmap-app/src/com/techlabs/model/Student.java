package com.techlabs.model;

public class Student {
	private int rollNo;
	private int standard;
	private String name;
	private double cgpa;

	public Student(int rollNo, int standard, String name, double cgpa) {
		this.rollNo = rollNo;
		this.standard = standard;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getStandard() {
		return standard;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(rollNo + "" + standard);
	}

	@Override
	public boolean equals(Object student) {
		if (this.hashCode() == student.hashCode())
			return true;
		return false;
	}
}
