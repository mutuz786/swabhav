package com.techlab.model;

public class Student {
	private String id;
	private String name;
	private int age;
	private String address;
	private double cgpa;

	public Student(String id, String name, int age, String address, double cgpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.cgpa = cgpa;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
}
