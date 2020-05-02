package com.techlabs.enggineeringcollegedb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Professor implements Person {
	private int id;
	private String name;
	private Date dob;
	private String address;
	private double basicSalary;
	private double bonus;

	public Professor(double basicSalary, double bonus, int id, String name, String dob, String address)
			throws ParseException {
		this.basicSalary = basicSalary;
		this.bonus = bonus;
		this.id = id;
		this.name = name;
		SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
		this.dob = (Date) dateFormat.parse(dob);
		this.address = address;
	}

	public double calculateSalary() {
		return (basicSalary * 12) + bonus;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Date getDob() {
		return dob;
	}

	@Override
	public String getAddress() {
		return address;
	}
}
