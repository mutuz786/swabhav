package com.techlabs.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter {
	String username = "murtaza";
	String password = "murtaza";

	public LoginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		if (uname.equals(username) && pword.equals(password))
			chain.doFilter(request, response);
		else {
			response.getWriter().print("<center>wrong username and password</center>");
			RequestDispatcher rd = request.getRequestDispatcher("login");
			rd.include(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
