package com.techlab.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.StudentDB;

@WebServlet("/studAdd")
public class StudentAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentAdd() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpServletRequest r = request;
		String[] entry = { r.getParameter("id"), r.getParameter("fname"), r.getParameter("lname"),
				r.getParameter("address"), r.getParameter("email") };
		StudentDB.add(entry);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
