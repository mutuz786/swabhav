package com.techlab.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlab.model.Employee;

public class EmployeeService {
	private static EmployeeService es;
	Connection conn = null;
	Statement stmt = null;

	private EmployeeService() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = (Statement) conn.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static EmployeeService getInstance() {
		if (es == null)
			es = new EmployeeService();
		return es;
	}

	public void updateEmployee(Employee employee) {
		try {
			stmt.executeUpdate("update employee set name='" + employee.getName() + "',post='" + employee.getPost()
					+ "',sal=" + employee.getSal() + ",doj='" + employee.getDoj() + "',dept='" + employee.getDept()
					+ "' where id='" + employee.getId() + "'");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void deleteEmployee(Employee employee) {
		try {
			stmt.executeUpdate("delete from employee where id='" + employee.getId() + "'");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void insertEmployee(Employee employee) {
		employee.setId(UUID.randomUUID().toString());
		try {
			stmt.executeUpdate("insert into employee values('" + employee.getId() + "','" + employee.getName() + "','"
					+ employee.getPost() + "'," + employee.getSal() + ",'" + employee.getDoj() + "','"
					+ employee.getDept() + "')");
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		ResultSet rs = null;
		try {
			rs = (ResultSet) stmt.executeQuery("select * from employee");
			if (rs != null) {
				while (rs.next()) {
					Employee emp = new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),
							rs.getString(5), rs.getString(6));
					employees.add(emp);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return employees;
	}

	public Employee getEmployee(String id) {
		for (Employee emp : getEmployees()) {
			if (emp.getId().equals(id))
				return emp;
		}
		return null;
	}
}
