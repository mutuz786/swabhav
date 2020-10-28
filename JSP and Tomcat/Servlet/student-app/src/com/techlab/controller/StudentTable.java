package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.techlab.model.StudentDB;

@WebServlet("/StudentTable")
public class StudentTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentTable() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ArrayList<String[]> entries = StudentDB.getData();
		out.print("<style> table, tr, td { border: 1px solid black; } </style>");
		out.print("<table>");
		for (String[] entry : entries) {
			out.print("<tr>");
			for (String item : entry) {
				out.println("<td>" + item + "</td>");
			}
			out.print("</tr>");
		}
		out.print("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
