package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionController")
public class SessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		Integer count = (Integer) session.getAttribute("oldCountS");
		if (count == null) {
			session.setAttribute("oldCountS", new Integer(-1));
			session.setAttribute("newCountS", new Integer(0));
		}
		PrintWriter out = response.getWriter();
		session.setAttribute("oldCountS", ((Integer) session.getAttribute("oldCountS")) + 1);
		session.setAttribute("newCountS", ((Integer) session.getAttribute("newCountS")) + 1);
		out.println("Old count:" + session.getAttribute("oldCountS"));
		out.println("<br>New Count:" + session.getAttribute("newCountS"));
		out.println("<br>id:" + session.getId());
		out.println("<br><a href=\'SummaryController'>Summary</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
