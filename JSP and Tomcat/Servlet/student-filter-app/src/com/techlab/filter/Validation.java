package com.techlab.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.techlab.model.AccountStatus;

@WebFilter("/validate")
public class Validation implements Filter {
	private String username = "murtaza";
	private String password = "murtaza";

	public Validation() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		if (uname.equals(username) && pword.equals(password)) {
			AccountStatus.startSession();
			request.setAttribute("accountType", "admin");
			chain.doFilter(request, response);
		} else {
			PrintWriter out = response.getWriter();
			out.print("incorrect username and password");
			RequestDispatcher rd = request.getRequestDispatcher("Login");
			rd.include(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
