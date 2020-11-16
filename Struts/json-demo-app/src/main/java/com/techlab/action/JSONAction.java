package com.techlab.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;

public class JSONAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<Employee> employees;;

	@Override
	public String execute() throws Exception {
		employees = EmployeeService.getInstance().getEmployees();
		return "success";
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
