package com.techlabs.model;

import java.util.*;

public class Partner {
	private UUID id;
	private String name;
	private double companyTurnOver;
	private int employeeStrength;
	private List<Talent> talents = new ArrayList<Talent>();

	public Partner(String name, double companyTurnOver, int employeeStrength) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.companyTurnOver = companyTurnOver;
		this.employeeStrength = employeeStrength;
	}

	public void addTalent(Talent talent) {
		talents.add(talent);
	}
	
	public int getTalentsCount() {
		return talents.size();
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

	public Iterable<Talent> getTalents() {
		return talents;
	}
}
