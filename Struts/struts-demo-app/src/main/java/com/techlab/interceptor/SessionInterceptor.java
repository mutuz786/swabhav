package com.techlab.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;
import com.techlab.model.User;

public class SessionInterceptor implements Interceptor {

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ValueStack stack = invocation.getStack();
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		User user = (User) session.get("user");
		if (user == null)
			return "login";
		else {
			return invocation.invoke();
		}
	}

}
