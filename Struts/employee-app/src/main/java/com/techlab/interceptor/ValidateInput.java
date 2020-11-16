package com.techlab.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.techlab.model.Employee;

public class ValidateInput extends ActionSupport implements Interceptor, ModelDriven<Employee> {
	private static final long serialVersionUID = 1L;
	private Employee employee;

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		return invocation.invoke();
	}

	public void validateIntercept() {
		System.out.println("hello");
		if (employee.getName().equals(""))
			addFieldError("name", "enter name");
		if (employee.getPost().equals(""))
			addFieldError("post", "enter post");
		if (employee.getSal() == 0)
			addFieldError("age", "enter age");
		if (employee.getDoj().equals(""))
			addFieldError("doj", "enter date");
		if (employee.getDept().equals(""))
			addFieldError("dept", "enter dept");

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
