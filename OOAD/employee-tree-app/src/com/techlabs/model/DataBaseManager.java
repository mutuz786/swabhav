package com.techlabs.model;

import java.io.*;
import java.util.*;

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
		placement();
	}

	private void placement() {
		for (Map.Entry employee : employees.entrySet()) {
			Employee emp = (Employee) employee.getValue();
			emp.addEmployee(employees.get(emp.getEmpNo()));
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

	public void addEmployee(Employee employee) {
		employees.put(employee.getEmpNo(), employee);
	}

}
