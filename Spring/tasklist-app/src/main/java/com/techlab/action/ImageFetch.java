package com.techlab.action;

import java.io.OutputStream;
import java.sql.Blob;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.service.UserService;

public class ImageFetch implements Action {
	@Autowired
	private UserService service;
	private String id;

	@Override
	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		Blob img = service.getUser(id).getImg();
		byte[] imgData = img.getBytes(1, (int) img.length());
		OutputStream stream = response.getOutputStream();
        response.setContentType("multipart/form-data");
		stream.write(imgData);
		stream.flush();
		stream.close();
		return Action.SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
