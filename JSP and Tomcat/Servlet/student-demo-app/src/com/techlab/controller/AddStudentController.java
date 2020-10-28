package com.techlab.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.Student;
import com.techlab.service.StudentService;

@WebServlet("/addStud")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentService.editStudent(getStudent(request));
		response.sendRedirect("Student");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentService.addStudent(getStudent(request));
		RequestDispatcher rd = request.getRequestDispatcher("Student");
		rd.forward(request, response);
	}

	private Student getStudent(HttpServletRequest request) {
		Student student = new Student();
		student.setId(request.getParameter("id"));
		student.setName(request.getParameter("name"));
		student.setRollNo(Integer.parseInt(request.getParameter("rollNo")));
		student.setAge(Integer.parseInt(request.getParameter("age")));
		return student;
	}

}
