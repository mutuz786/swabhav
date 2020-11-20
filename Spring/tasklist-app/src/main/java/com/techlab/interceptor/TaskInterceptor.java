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
		HttpServletRequest req = ServletActionContext.getRequest();
		ValueStack stack = invocation.getStack();
		String id = stack.findString("id");
		
		if (session.get("user") == null) {
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

		if (id != null) {
			User user = userService.getUser(id);
			if (user != null)
				session.put("user", user);
			Task task = taskService.getTask(id);
			if (task != null)
				session.put("task", task);
		}

		Object isAdmin = session.get("isAdmin");
		if (isAdmin != null) {
			if ((boolean) isAdmin)
				req.setAttribute("isAdmin", true);
		}
		return invocation.invoke();
	}

}
