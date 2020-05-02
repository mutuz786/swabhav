package com.techlabs.enggineeringcollegedb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Person {
	private int id;
	private String name;
	private Date dob;
	private String address;
	private Branch branch;

	public Student(Branch branch, int id, String name, String dob, String address) throws ParseException {
		this.id = id;
		this.name = name;
		SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
		this.dob = (Date) dateFormat.parse(dob);
		this.address = address;
		this.branch = branch;
	}

	public String getBranch() {
		return branch.name().toLowerCase();
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
