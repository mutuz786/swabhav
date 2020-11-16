package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;

public class AddAction extends ActionSupport implements ModelDriven<Employee> {
	private static final long serialVersionUID = 1L;
	private Employee employee;

	@Override
	public String execute() throws Exception {
		return "success";
	}

	public String addDo() {
		EmployeeService.getInstance().insertEmployee(employee);
		return "success";
	}

	public void validateAddDo() {
		if (employee.getName() == "")
			addFieldError("name", "name required");
		if (employee.getPost() == "")
			addFieldError("post", "post required");
		if (employee.getSal() == 0)
			addFieldError("sal", "salary required");
		if (employee.getDoj() == "")
			addFieldError("doj", "date required");
		if (employee.getDept() == "")
			addFieldError("dept", "dept required");
	}

	@Override
	public Employee getModel() {
		employee = new Employee();
		return employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
