package com.techlab.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import com.techlab.model.Contact;
import com.techlab.service.ContactService;

@WebFilter("/EditContact")
public class FindContact implements Filter {

	public FindContact() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		ContactService cs =ContactService.getInstance();
		Contact contact = cs.getContact(request.getParameter("id"));
		request.setAttribute("contact", contact);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
