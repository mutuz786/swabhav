package com.techlabs.model.test;

import java.util.Comparator;

import com.techlabs.model.Employee;

public class DesignationComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getDesignation().compareTo(emp2.getDesignation()) > 0)
			return 1;
		if (emp1.getDesignation().compareTo(emp2.getDesignation()) < 0)
			return -1;
		return 0;
	}

}
