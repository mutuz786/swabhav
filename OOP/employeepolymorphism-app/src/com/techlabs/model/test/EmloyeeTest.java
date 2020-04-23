package com.techlabs.model.test;

import com.techlabs.model.*;

public class EmloyeeTest {
	public static void main(String[] args) {
		Manager manager = new Manager(100, "murtaza", "male", 10000);
		printSalarySlip(manager);
	}

	private static void printSalarySlip(Employee employee) {
		System.out.println("role:"+employee+"\nid:"+employee.getId()+"\nname:"+employee.getName()+"\ngender"+employee.getGender()+"\nnet salary"+employee.calculateNetSalary()+"\n"+employee.getAllowances());
	}
}
