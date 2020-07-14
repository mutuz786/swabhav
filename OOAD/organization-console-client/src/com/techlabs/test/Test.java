package com.techlabs.test;

import com.techlabs.model.DiskLoader;
import com.techlabs.model.Employee;
import com.techlabs.model.OrgHierarchyBuilder;

public class Test {
	public static void main(String[] args) throws Exception {
		OrgHierarchyBuilder builder = new OrgHierarchyBuilder(new DiskLoader("Employees.csv"));
		Employee emp=builder.getCeo();
		System.out.println(emp.show(0));
		System.out.println("\n\n"+emp.showXml(0));
	}
}
