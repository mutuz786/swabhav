package com.techlabs.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int empId;
	private String eName;
	private String role;
	private int managerId;
	private Date doj;
	private int salary;
	private int comm;
	private int deptId;

	Employee(int empId, String eName, String role, int managerId, String doj, int salary, int comm, int deptId)
			throws ParseException {
		this.empId = empId;
		this.eName = eName;
		this.role = role;
		this.managerId = managerId;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		this.doj = (Date) dateFormat.parse(doj);
		this.salary = salary;
		this.comm = comm;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public String geteName() {
		return eName;
	}

	public String getRole() {
		return role;
	}

	public int getManagerId() {
		return managerId;
	}

	public Date getDoj() {
		return doj;
	}

	public int getSalary() {
		return salary;
	}

	public int getComm() {
		return comm;
	}

	public int getDeptId() {
		return deptId;
	}
}
