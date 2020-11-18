package com.techlab.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;
import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.service.TaskService;
import com.techlab.service.UserService;

public class TaskInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;

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
		ValueStack stack = invocation.getStack();
		String id = stack.findString("id");
		if (id != null) {
			User user = userService.getUser(id);
			System.out.println(user);
			if (user != null)
				session.put("user", user);
			Task task = taskService.getTask(id);
			if (task != null)
				session.put("task", task);
		}
		if (session.get("isUser") == null || session.get("isUser").equals(false)) {
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
