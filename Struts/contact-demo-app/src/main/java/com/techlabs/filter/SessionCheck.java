package com.techlabs.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.techlabs.service.SessionService;

public class SessionCheck implements Filter {

	public SessionCheck() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String sessionId = ((HttpServletRequest) request).getSession().getId();
		if (SessionService.getInstance().isSessionPresent(sessionId))
			chain.doFilter(request, response);
		else {
			request.setAttribute("path", ((HttpServletRequest) request).getRequestURI());
			request.setAttribute("query", ((HttpServletRequest) request).getQueryString());
			RequestDispatcher rd = request.getRequestDispatcher("login");
			rd.forward(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
