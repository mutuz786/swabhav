package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String name;
	private String designation;
	private int managerId;
	private Date doj;
	private int salary;
	private int commision;
	private int deptNo;

	public Employee(int empId, String name, String role, int managerId, String doj, int salary, int commision,
			int deptNo) {
		this.empId = empId;
		this.name = name;
		this.designation = role;
		this.managerId = managerId;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			this.doj = formatter.parse(doj);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.salary = salary;
		this.commision = commision;
		this.deptNo = deptNo;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
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

	public int getCommision() {
		return commision;
	}

	public int getDeptNo() {
		return deptNo;
	}

	@Override
	public int hashCode() {
		return this.empId;
	}

	@Override
	public int compareTo(Employee employee) {
		if (this.hashCode() > employee.hashCode())
			return 1;
		if (this.hashCode() < employee.hashCode())
			return -1;
		return 0;
	}
}
