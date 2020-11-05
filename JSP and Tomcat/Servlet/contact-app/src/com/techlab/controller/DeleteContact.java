package com.techlab.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.Contact;
import com.techlab.service.ContactService;

@WebServlet("/DeleteC")
public class DeleteContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteContact() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		ContactService cs = ContactService.getInstance();
		Contact contact=cs.getContact(id);
		cs.deleteContact(contact);
		response.sendRedirect("Index");
	}

}
