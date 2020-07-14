package com.techlabs.model;

import java.util.*;
import java.util.Map.*;

public class OrgHierarchyBuilder {
	Map<Integer, Employee> employees;

	public OrgHierarchyBuilder(Iloader loader) {
		employees = loader.getEmpList();
		createHierarchy();
	}

	public void createHierarchy() {
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

	public Map<Integer, Employee> getEmployees() {
		return employees;
	}

	public Employee getCeo() {
		for (Map.Entry employee : employees.entrySet()) {
			Employee emp = (Employee) employee.getValue();
			if (emp.getJob().contains("PRESIDENT")) {
				return emp;
			}
		}
		return null;
	}
}
