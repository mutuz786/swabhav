package com.techlab.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class SessionCheck implements Interceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		SessionMap<String, Object> session = (SessionMap<String, Object>) invocation.getInvocationContext()
				.getSession();
		if (session.get("user") == null) {
			HttpServletRequest req = ServletActionContext.getRequest();
			String[] uri = req.getRequestURI().split("/");
			String link;
			if (req.getQueryString() == null) {
				link = uri[2];
			} else {
				link = uri[2] + "?" + req.getQueryString();
			}
			session.put("link", link);
			return "login";
		}
		return invocation.invoke();
	}

}
