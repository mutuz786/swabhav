package com.techlab.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.techlab.model.Student;

@WebFilter("/addStud")
public class StudentCreate implements Filter {

	public StudentCreate() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Student student = new Student();
		student.setId(request.getParameter("id"));
		student.setName(request.getParameter("name"));
		student.setRollNo(Integer.parseInt(request.getParameter("rollNo")));
		student.setAge(Integer.parseInt(request.getParameter("age")));
		request.setAttribute("student", student);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}