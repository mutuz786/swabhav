package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;

public class DeleteAction implements Action {
	private String id;

	@Override
	public String execute() throws Exception {
		Employee emp = EmployeeService.getInstance().getEmployee(id);
		EmployeeService.getInstance().deleteEmployee(emp);
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
