package com.techlab.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class NumInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ValueStack stack = invocation.getStack();
		Integer num = Integer.parseInt(stack.findString("num"));
		System.out.println(num);
		if (num <= 0 || num == null)
			stack.set("num", 1);
		if (num > 100)
			stack.set("num", 100);
		return invocation.invoke();
	}

}
