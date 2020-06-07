package com.techlabs.model.test;

import java.util.*;
import java.util.Map.Entry;

import com.techlabs.model.*;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeDataAnalyzer analyzer1 = new EmployeeDataAnalyzer(new DiskLoader());
		EmployeeDataAnalyzer analyzer2 = new EmployeeDataAnalyzer(new LinkLoader());
		EmployeeDataAnalyzer analyzer3 = new EmployeeDataAnalyzer(new CsvLoader());

		System.out.println("Highest Salaried employee name in disk:");
		printInfo(analyzer1.maxSalaryEmployee());

		System.out.println("\nHighest Salaried employee name in link:");
		printInfo(analyzer2.maxSalaryEmployee());

		System.out.println("\nHighest Salaried employee name in csvfile:");
		printInfo(analyzer3.maxSalaryEmployee());

		TreeMap<String, Integer> designationMap1 = (TreeMap<String, Integer>) analyzer1.getDesignationWiseEmps();
		System.out.println("\nTotal number of employee in disk based on designation:");
		printInfo(designationMap1);

		TreeMap<Integer, Integer> deptMap1 = (TreeMap<Integer, Integer>) analyzer1.getDeptNoWiseEmps();
		System.out.println("\nTotal number of employee in disk based on designation:");
		printInfo1(deptMap1);

		TreeMap<String, Integer> designationMap2 = (TreeMap<String, Integer>) analyzer2.getDesignationWiseEmps();
		System.out.println("\nTotal number of employee in link based on designation:");
		printInfo(designationMap2);

		TreeMap<String, Integer> designationMap3 = (TreeMap<String, Integer>) analyzer3.getDesignationWiseEmps();
		System.out.println("\nTotal number of employee in csv file based on designation:");
		printInfo(designationMap3);
	}

	private static void printInfo1(TreeMap<Integer, Integer> deptMap) {
		for (Entry<Integer, Integer> entry : deptMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	private static void printInfo(Employee employee) {
		System.out.println("Name:" + employee.getName() + "\nSalary:" + employee.getSalary() + "\nDesignation"
				+ employee.getDesignation());
	}

	private static void printInfo(TreeMap<String, Integer> designationMap) {
		for (Entry<String, Integer> entry : designationMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
