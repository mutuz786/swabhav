package com.techlabs.model.test;

import java.text.ParseException;
import java.util.*;
import com.techlabs.model.DataBaseManager;
import com.techlabs.model.Employee;

public class DataBaseTest {
	public static void main(String[] args) throws ParseException {
		DataBaseManager dbManager = new DataBaseManager();
		dbManager.init();
		TreeSet<Employee> employees1 = (TreeSet<Employee>) dbManager.getEmployees();
		List<Employee> employees2 = (List<Employee>) dbManager.getEmployees();
		HashSet<Employee> employees3 = (HashSet<Employee>) dbManager.getEmployees();
		print(employees1);
		print(employees2);
		print(employees3);
	}
	
	private static void print(Collection<Employee> employees) {
		for (Employee employee : employees) {
			printInfo(employee);
		}
	}

	private static void printInfo(Employee employee) {
		// System.out.print("empid:"+employee.getEmpId());
		System.out.print(" ename:" + employee.geteName());
		// System.out.print(" role:"+employee.getRole());
		// System.out.print(" managerId:"+employee.getManagerId());
		// System.out.print(" doj:"+employee.getDoj());
		System.out.println(" salary:" + employee.getSalary());
		// System.out.print(" comm:"+employee.getComm());
		// System.out.println(" deptid:"+employee.getDeptId());
	}
}
