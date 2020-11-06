package com.techlab.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.techlab.model.Student;

public class SetStudent implements Filter {

	public SetStudent() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String id;
		if (request.getParameter("id") == null)
			id = UUID.randomUUID().toString();
		else
			id = request.getParameter("id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		double cgpa = Double.parseDouble(request.getParameter("cgpa"));
		Student student = new Student(id, name, age, address, cgpa);
		request.setAttribute("student", student);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
