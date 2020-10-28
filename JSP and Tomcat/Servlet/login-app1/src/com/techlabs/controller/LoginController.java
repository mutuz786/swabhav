package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Login;

@WebServlet("/auth")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		RequestDispatcher view;
		if (Login.isValid(uname, pword)) {
			view = request.getRequestDispatcher("success.jsp");
			request.setAttribute("result", "pass");
		} else {
			view = request.getRequestDispatcher("failure.jsp");
			request.setAttribute("result", "fail");
		}
		view.include(request, response);
	}

}
