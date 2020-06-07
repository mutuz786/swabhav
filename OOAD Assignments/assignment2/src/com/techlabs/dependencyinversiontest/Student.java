package com.techlabs.dependencyinversiontest;

public class Student implements PersonalData {
	private int id;
	private String name;
	private String address;
	private int age;
	private double cgpa;

	public Student(int id, String name, String address, int age, double cgpa) {
		this.cgpa = cgpa;
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public double getCgpa() {
		return cgpa;
	}
}
