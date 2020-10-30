package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.Student;
import com.techlab.service.StudentService;

@WebServlet("/editStud")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student student = (Student) request.getAttribute("student");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<form action='addStud?id=" + student.getId() + "' method='get'>");
		out.print("<input type='hidden' name='id' value='" + student.getId() + "' >");
		out.print("Name:<input type='text' name='name' value='" + student.getName() + "'>");
		out.print("<br>RollNo:<input type='text' name='rollNo' value='" + student.getRollNo() + "'>");
		out.print("<br>Age:<input type='text' name='age' value='" + student.getAge() + "'>");
		out.print("<br><input type='submit' value='submit'></form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
