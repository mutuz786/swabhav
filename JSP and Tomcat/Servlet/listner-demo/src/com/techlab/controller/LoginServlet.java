package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String name = (String) session.getAttribute("name");
		if (name == null) {
			if (uname.equals("admin") && pword.equals("admin")) {
				session.setAttribute("name", uname);
				out.println("<h2>Login Successful</h2>");
				out.println("<br><a href='logout'>logout</a>");
			}
		} else if (name.equals(uname)) {
			out.print("<h2>Already Login</h2>");
		}else {
			out.print("<h2>Login Failed</h2>");
		}
	}

}
