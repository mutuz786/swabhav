package com.techlabs.model;

import java.util.UUID;

public class Talent {
	private UUID id;
	private String name;
	private double cgpa;
	private Partner partner;
	private String techStack;

	public Talent(String name, double cgpa, Partner partner, String techStack) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.cgpa = cgpa;
		this.partner = partner;
		this.techStack = techStack;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public Partner getPartner() {
		return partner;
	}

	public String getTechStack() {
		return techStack;
	}
}
