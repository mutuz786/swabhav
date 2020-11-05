package com.techlab.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.service.ContactService;

@WebServlet("/SearchC")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cond = request.getParameter("cond");
		String condValue = request.getParameter("condValue");
		ContactService cs = ContactService.getInstance();
		request.setAttribute("contacts", cs.searchContact(cond, condValue));
		RequestDispatcher rd = request.getRequestDispatcher("Search");
		rd.forward(request, response);

	}

}
