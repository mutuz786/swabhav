package com.techlab.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.Contact;
import com.techlab.service.ContactService;

@WebServlet("/AddContact")
public class AddContact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddContact() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Add");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = UUID.randomUUID().toString(), fname = request.getParameter("fname"),
				mname = request.getParameter("mname"), lname = request.getParameter("lname"),
				phoneNo = request.getParameter("phoneNo"), email = request.getParameter("email");
		Contact contact = new Contact(id, fname, mname, lname, phoneNo, email);
		ContactService cs = ContactService.getInstance();
		cs.addContact(contact);
		response.sendRedirect("Index");
	}
}
