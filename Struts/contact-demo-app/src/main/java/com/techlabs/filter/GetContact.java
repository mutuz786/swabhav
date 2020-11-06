package com.techlabs.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class GetContact implements Filter {

	public GetContact() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String id = request.getParameter("id");
		System.out.println(id);
		Contact contact = ContactService.getInstance().getContact(id);
		request.setAttribute("contact", contact);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
