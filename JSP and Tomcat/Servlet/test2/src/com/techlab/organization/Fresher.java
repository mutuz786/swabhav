package com.techlab.organization;

import java.util.UUID;

public class Fresher {
	private UUID id;
	private String name;
	private double cgpa;
	private PartnerCompany partner;
	private String tech;

	public Fresher(String name, double cgpa, PartnerCompany partner, String tech) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.cgpa = cgpa;
		this.partner = partner;
		this.tech = tech;
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

	public PartnerCompany getPartner() {
		return partner;
	}

	public String getTechStack() {
		return tech;
	}
}
