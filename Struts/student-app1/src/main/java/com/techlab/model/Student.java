package com.techlab.model;

import com.techlab.viewmodel.AddVM;

public class Student {
	private String id, name, email;
	private int age;
	private double cgpa;

	public Student(String id, String name, int age, String email, double cgpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.cgpa = cgpa;

	}

	public Student(String id, AddVM vm) {
		this.id = id;
		this.name = vm.getName();
		this.age = vm.getAge();
		this.email = vm.getEmail();
		this.cgpa = vm.getCgpa();

	}

	public Student() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
