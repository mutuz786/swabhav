package com.techlabs.model.test;

import java.text.ParseException;
import java.util.TreeSet;

import com.techlabs.model.DataBaseManager;
import com.techlabs.model.Employee;

public class DataBaseTest {
	public static void main(String[] args) throws ParseException {
		DataBaseManager dbManager = new DataBaseManager();
		dbManager.init();
		TreeSet<Employee> employees = dbManager.getEmployees();
		for (Employee employee : employees) {
			printInfo(employee);
		}
	}

	private static void printInfo(Employee employee) {
		//System.out.print("empid:"+employee.getEmpId());
		System.out.print(" ename:"+employee.geteName());
		//System.out.print(" role:"+employee.getRole());
		//System.out.print(" managerId:"+employee.getManagerId());
		//System.out.print(" doj:"+employee.getDoj());
		System.out.println(" salary:"+employee.getSalary());
		//System.out.print(" comm:"+employee.getComm());
		//System.out.println(" deptid:"+employee.getDeptId());
	}
}
