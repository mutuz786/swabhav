package com.techlabs.model;

import java.io.*;
import java.util.*;

public class Test {
	public static void main(String[] args) throws Exception {
		DataBaseManager manager = new DataBaseManager();
		manager.extract(new FileReader(new File("Employees.csv")));
		Employee employee1 = new Employee(7864, "MURTAZA", "CLERK", 7782, "17-DEC-80", 29000, 0, 10);
		manager.addEmployee(employee1);
		for (Map.Entry employee : manager.getEmployees().entrySet()) {
			Employee emp=(Employee) employee.getValue();
			if (emp.getJob().contains("PRESIDENT")) {
				System.out.println(emp.show(0));
			}
		}
	}
}
