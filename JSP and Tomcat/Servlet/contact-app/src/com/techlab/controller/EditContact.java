package com.techlab.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.Contact;
import com.techlab.service.ContactService;

@WebServlet("/EditC")
public class EditContact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditContact() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id"), fname = request.getParameter("fname"),
				mname = request.getParameter("mname"), lname = request.getParameter("lname"),
				phoneNo = request.getParameter("phoneNo"), email = request.getParameter("email");
		Contact contact = new Contact(id, fname, mname, lname, phoneNo, email);
		ContactService cs = ContactService.getInstance();
		cs.editContact(contact);
		response.sendRedirect("Index");
	}

}
