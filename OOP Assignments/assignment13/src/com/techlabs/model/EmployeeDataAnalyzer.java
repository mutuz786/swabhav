package com.techlabs.model;

import java.util.*;

public class EmployeeDataAnalyzer {
	private Collection<Employee> empList = new TreeSet<Employee>();
	FileManager filer = new FileManager();

	public void addData(Extractable extractable) {
		ArrayList<String> lines = (ArrayList<String>) filer.getData(extractable.getReader());
		addEmpData(lines);
	}

	private void addEmpData(Collection<String> lines) {
		for (String line : lines) {
			String[] empData = line.split(",");
			int empId = addInteger(empData[0]);
			String name = addString(empData[1]);
			String role = addString(empData[2]);
			int managerId = addInteger(empData[3]);
			String doj = addString(empData[4]);
			int salary = addInteger(empData[5]);
			int commision = addInteger(empData[6]);
			int deptNo = addInteger(empData[7]);
			Employee employee = new Employee(empId, name, role, managerId, doj, salary, commision, deptNo);
			empList.add(employee);
		}
	}

	public Employee maxSalaryEmployee() {
		TreeSet<Employee> sortedEmpList = new TreeSet<Employee>(new SalaryComparator());
		sortedEmpList.addAll(empList);
		return sortedEmpList.last();
	}

	public Map<String, Integer> getDesignationWiseEmps() {
		TreeSet<String> designationSet = new TreeSet<String>();
		for (Employee emp : empList) {
			designationSet.add(emp.getDesignation());
		}
		TreeMap<String, Integer> DesignationWiseEmps = new TreeMap<String, Integer>();
		for (String designation : designationSet) {
			DesignationWiseEmps.put(designation, checkCount(designation));
		}
		return DesignationWiseEmps;
	}

	private int checkCount(String designation) {
		int count = 0;
		for (Employee emp : empList) {
			if (designation.equals(emp.getDesignation()))
				count++;
		}
		return count;

	}

	private String addString(String data) {
		return data.replaceAll("'", "");
	}

	private int addInteger(String data) {
		if (data.equalsIgnoreCase("NULL"))
			return 0;
		return Integer.parseInt(data);
	}

	public Iterable<Employee> getEmployeeList() {
		return (Iterable<Employee>) empList;
	}
}