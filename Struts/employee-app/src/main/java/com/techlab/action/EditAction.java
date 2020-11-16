package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;

public class EditAction extends ActionSupport implements ModelDriven<Employee> {
	private static final long serialVersionUID = 1L;
	private Employee employee;

	@Override
	public String execute() throws Exception {
		employee = EmployeeService.getInstance().getEmployee(employee.getId());
		return "success";
	}

	public String editDo() {
		EmployeeService.getInstance().updateEmployee(employee);
		return "success";
	}

	public void validateEditDo() {
		if (employee.getName() == "")
			addFieldError("name", "Name required");
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
