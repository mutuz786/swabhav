package com.techlabs.model;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getEmpId() > emp2.getEmpId())
			return 1;
		if (emp1.getEmpId() < emp2.getEmpId())
			return -1;
		return 0;
	}

}
