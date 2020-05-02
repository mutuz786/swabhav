package com.techlabs.enggineeringcollegedb;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person {
	private int id;
	private String name;
	private Date dob;
	private String address;

	public Person(int id, String name, String dob, String address) throws ParseException {
		this.id = id;
		this.name = name;
		SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
		this.dob = (Date) dateFormat.parse(dob);
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}

}
