package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth")
public class AuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AuthController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		PrintWriter out = response.getWriter();
		if (uname.equals("admin") && pword.equals("admin")) {
			out.print("<h2>Login Successful<h2>");
		} else {
			out.print("<h2>Login Failed<h2>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
