package com.techlab.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.techlab.model.Session;

public class SessionCheck implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Session session = Session.getInstance();
		String sessionId = ((HttpServletRequest) request).getSession().getId();
		System.out.println("In SessionCheck" + session.getStatus(sessionId));
		if (session.getStatus(sessionId)) {
			request.setAttribute("isAdmin", "true");
			chain.doFilter(request, response);
		} else {
			String url = null;
			if (request instanceof HttpServletRequest) {
				url = ((HttpServletRequest) request).getRequestURL().toString();
			}
			String[] parts = url.split("/");
			String destination = parts[parts.length - 1];
			RequestDispatcher rd = request.getRequestDispatcher("Login");
			request.setAttribute("destination", destination);
			rd.forward(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
