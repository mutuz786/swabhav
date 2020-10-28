package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthFilter implements Filter {

	public AuthFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		if (uname.equals("admin") && pword.equals("admin")) {
			chain.doFilter(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/filterExample.html");
			PrintWriter out = response.getWriter();
			out.println("<b>Either username or password is wrong.</b>");
			rd.include(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
