package com.techlab.service;

import java.util.UUID;

import com.techlab.model.Employee;

public class Test {
	public static void main(String[] args) {
		Employee emp1 = new Employee(UUID.randomUUID().toString(), "murtaza", "developer", 100000, "10-10-2020", "IT");
		Employee emp2 = new Employee(UUID.randomUUID().toString(), "rahul", "manager", 61245, "30-12-2020", "Sales");
		Employee emp3 = new Employee(UUID.randomUUID().toString(), "soham", "analyst", 65635, "12-05-2020", "Sales");
		Employee emp4 = new Employee(UUID.randomUUID().toString(), "gaurav", "manager", 544134, "23-03-2020", "IT");
		EmployeeService.getInstance().insertEmployee(emp1);
		EmployeeService.getInstance().insertEmployee(emp2);
		EmployeeService.getInstance().insertEmployee(emp3);
		EmployeeService.getInstance().insertEmployee(emp4);
		for(Employee emp:EmployeeService.getInstance().getEmployees()) {
			System.out.println(emp.getName());
		}
	}

}
