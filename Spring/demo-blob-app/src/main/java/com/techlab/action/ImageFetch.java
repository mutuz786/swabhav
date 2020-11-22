package com.techlab.action;

import java.io.OutputStream;
import java.sql.Blob;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.service.PersonService;

public class ImageFetch implements Action {
	@Autowired
	private PersonService service;
	private String id;

	@Override
	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		System.out.println(id);
		Blob img = service.getperson(id).getImg();
		byte[] imgData = img.getBytes(1, (int) img.length());
		System.out.println(imgData);
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
