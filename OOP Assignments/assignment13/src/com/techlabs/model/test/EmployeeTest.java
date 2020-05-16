package com.techlabs.model.test;

import java.util.*;
import java.util.Map.Entry;

import com.techlabs.model.*;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeDataAnalyzer dbManager = new EmployeeDataAnalyzer();
		dbManager.addData(new DiskExtractor("dataFile_emp.txt"));
		dbManager.addData(new LinkExtractor("https://swabhav-tech.firebaseapp.com/emp.txt"));
		TreeSet<Employee> empList = new TreeSet<Employee>();
		empList = (TreeSet<Employee>) dbManager.getEmployeeList();
		System.out.println("Highest Salary employee name:" + dbManager.maxSalaryEmployee().getName());
		// printInfo(empList);
		TreeMap<String, Integer> designationMap = new TreeMap<String, Integer>();
		designationMap = (TreeMap<String, Integer>) dbManager.getDesignationWiseEmps();
		printInfo(designationMap);
	}

	private static void printInfo(TreeMap<String, Integer> designationMap) {
		for (Entry<String, Integer> entry : designationMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	private static void printInfo(Collection<Employee> empList) {
		for (Employee emp : empList) {
			System.out.println(emp.getName() + "\t" + emp.getSalary());
		}
	}
}
