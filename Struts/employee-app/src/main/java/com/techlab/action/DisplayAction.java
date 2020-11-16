package com.techlab.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;

public class DisplayAction implements Action {
	private List<Employee> employees = new ArrayList<Employee>();

	@Override
	public String execute() throws Exception {
		employees = EmployeeService.getInstance().getEmployees();
		return "success";
	}

	public List<Employee> getEmployees() {
		return employees;
	}

}
