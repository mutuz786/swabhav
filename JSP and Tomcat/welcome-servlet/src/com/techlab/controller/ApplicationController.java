package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

@WebServlet("/ApplicationController")
public class ApplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Integer oldCount;
	private static Integer newCount;

	public void init() {
		oldCount = -1;
		newCount = 0;
	}

	public ApplicationController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		oldCount++;
		newCount++;
		out.println("Old count:" + oldCount);
		out.println("<br>New Count:" + newCount);
		out.println("<br>id:" + session.getId());
		out.println("<br><a href=\'SummaryController'>Summary</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public static int getCount() {
		return newCount;
	}
}
