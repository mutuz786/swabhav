package com.techlabs.model;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class DataBaseManager {
	Map<Integer, Employee> employees;

	public DataBaseManager() {
		employees = new TreeMap<Integer, Employee>();
	}

	public void extract(Reader reader) {
		try {
			String[] properties;
			BufferedReader bReader = new BufferedReader(reader);
			String line = "";
			bReader.readLine();
			while ((line = bReader.readLine()) != null) {
				properties = line.split(",");
				int empNo = toInteger(properties[0]);
				String name = toString(properties[1]);
				String job = toString(properties[2]);
				int mngNo = toInteger(properties[3]);
				String hireDate = toString(properties[4]);
				int salary = toInteger(properties[5]);
				int comm = toInteger(properties[6]);
				int deptNo = toInteger(properties[7]);
				employees.put(empNo, new Employee(empNo, name, job, mngNo, hireDate, salary, comm, deptNo));
			}
			bReader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		for (Map.Entry employee : employees.entrySet()) {
			findRepoter((Employee) employee.getValue());
		}
	}

	private void findRepoter(Employee employee) {
		Employee emp1 = employee;
		Employee emp2 = employees.get(emp1.getMngNo());
		if (emp2 != null && emp1 != null)
			emp2.addReportee(emp1);
	}

	public void addEmployee(Employee employee) {
		employees.put(employee.getEmpNo(), employee);
		findRepoter(employee);
		for (Map.Entry empEntry : employees.entrySet()) {
			if (((Employee) empEntry.getValue()).getMngNo() == employee.getEmpNo())
				employee.addReportee((Employee) empEntry.getValue());
		}
	}

	private String toString(String text) {
		return text.replace("'", "");
	}

	private int toInteger(String text) {
		if (!text.contains("NULL")) {
			return Integer.parseInt(text);
		}
		return 0;
	}

	public Map<Integer, Employee> getEmployees() {
		return employees;
	}

}
