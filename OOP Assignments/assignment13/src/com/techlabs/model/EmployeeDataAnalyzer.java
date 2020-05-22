package com.techlabs.model;

import java.util.*;

public class EmployeeDataAnalyzer {
	private Collection<Employee> empList = new TreeSet<Employee>();
	FileManager filer = new FileManager();

	public EmployeeDataAnalyzer(ILoader loader) {
		empList = loader.load();
	}

	public Employee maxSalaryEmployee() {
		TreeSet<Employee> sortedEmpList = new TreeSet<Employee>(new SalaryComparator());
		sortedEmpList.addAll(empList);
		return sortedEmpList.last();
	}

	public Map<String, Integer> getDesignationWiseEmps() {
		TreeMap<String, Integer> designationSet = new TreeMap<String, Integer>();
		for (Employee emp : empList) {
			if (designationSet.containsKey(emp.getDesignation())) {
				designationSet.put(emp.getDesignation(), designationSet.get(emp.getDesignation()) + 1);
			} else
				designationSet.put(emp.getDesignation(), 1);
		}
		return designationSet;
	}

	public Map<Integer, Integer> getDeptNoWiseEmps() {
		TreeMap<Integer, Integer> deptNoSet = new TreeMap<Integer, Integer>();
		for (Employee emp : empList) {
			if (deptNoSet.containsKey(emp.getDeptNo())) {
				deptNoSet.put(emp.getDeptNo(), deptNoSet.get(emp.getDeptNo()) + 1);
			} else
				deptNoSet.put(emp.getDeptNo(), 1);
		}
		return deptNoSet;
	}

	public Iterable<Employee> getEmployeeList() {
		return (Iterable<Employee>) empList;
	}
}