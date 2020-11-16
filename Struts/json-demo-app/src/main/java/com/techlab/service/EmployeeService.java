package com.techlab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlab.model.Employee;

public class EmployeeService {
	private static EmployeeService es;
	private List<Employee> employees;

	public EmployeeService() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee(UUID.randomUUID().toString(), "murtaza", " manager", 76523));
		employees.add(new Employee(UUID.randomUUID().toString(), "sagar", " developer", 65342));
		employees.add(new Employee(UUID.randomUUID().toString(), "gaurav", " developer", 73563));
		employees.add(new Employee(UUID.randomUUID().toString(), "rahul", " manager", 62552));
	}

	public static EmployeeService getInstance() {
		if (es == null)
			es = new EmployeeService();
		return es;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

}
