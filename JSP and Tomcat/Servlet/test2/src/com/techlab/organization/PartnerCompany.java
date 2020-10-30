package com.techlab.organization;

import java.util.*;

public class PartnerCompany {

	private UUID id;
	private String name;
	private double companyTurnOver;
	private int employeeStrength;
	private List<Fresher> freshers = new ArrayList<Fresher>();

	public PartnerCompany(String name, double companyTurnOver, int employeeStrength) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.companyTurnOver = companyTurnOver;
		this.employeeStrength = employeeStrength;
	}

	public void addFresher(Fresher fresher) {
		freshers.add(fresher);
	}

	public int getFresherCount() {
		return freshers.size();
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCompanyTurnOver() {
		return companyTurnOver;
	}

	public int getEmployeeStrength() {
		return employeeStrength;
	}

	public Iterable<Fresher> getFresher() {
		return freshers;
	}
}
