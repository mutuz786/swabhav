package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Employee implements Comparable<Employee> {
	private int empNo;
	private String name;
	private String job;
	private int mngNo;
	private Date hireDate;
	private double salary;
	private double comm;
	private int deptNO;
	private Set<Employee> reportee = new TreeSet<Employee>();

	public Employee(int empNo, String name, String job, int mngNo, String hireDate, double salary, double comm,
			int deptNo) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
		this.empNo = empNo;
		this.name = name;
		this.job = job;
		this.mngNo = mngNo;
		this.hireDate = formatter.parse(hireDate);
		this.salary = salary;
		this.comm = comm;
		this.deptNO = deptNo;
	}

	public void addReportee(Employee employee) {
		reportee.add(employee);
	}

	public String show(int i) {
		String tree = name + " (" + job + ")";
		for (Employee junior : reportee) {
			tree += "\n" + Lpadding(i) + "|->" + junior.show(i + 1);
		}
		return tree;
	}

	public String showXml(int i) {
		String tree = "<" + name + ">";
		for (Employee junior : reportee) {
			tree += "\n" + Lpadding(i) + junior.showXml(i + 1);
		}
		tree += "\n" + Lpadding(i - 1) + "</" + name + ">";
		return tree;
	}

	private String Lpadding(int padding) {
		String lPadding = "";
		for (int i = 0; i < padding + 1; i++) {
			lPadding += "  ";
		}
		return lPadding;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public int getMngNo() {
		return mngNo;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public double getComm() {
		return comm;
	}

	public int getDeptNO() {
		return deptNO;
	}

	public Set<Employee> getReportee() {
		return reportee;
	}

	@Override
	public int compareTo(Employee emp) {
		if (this.empNo > emp.getEmpNo()) {
			return 1;
		}
		if (this.getEmpNo() < emp.getEmpNo()) {
			return -1;
		}
		return 0;
	}
}
