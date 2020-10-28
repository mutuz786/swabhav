package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SummaryController")
public class SummaryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SummaryController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		out.print("<h2>Session Count:" + session.getAttribute("newCountS"));
		out.print("<h2>Application Count:" + ApplicationController.getCount());
		out.println("<br></h2><a href=\'SessionController'>Session</a>");
		out.println("<a href=\'ApplicationController'>Application</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
