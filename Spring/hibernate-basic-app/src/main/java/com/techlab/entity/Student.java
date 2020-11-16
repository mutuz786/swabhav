package com.techlab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	public String toString() {
		return "Student[id=" + id + "\t,name=" + name + "\t,cgpa=" + cgpa + "]";
	}

	@Id
	private String id;
	private String name;
	private double cgpa;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
}
