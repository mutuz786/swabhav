<%@page import="java.util.List"%>
<%@page import="com.techlab.service.Test"%>
<%@page import="com.techlab.model.Student"%>
<%@page import="com.techlab.service.StudentService"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<style>
table, tr, td {
	border: 1px solid black;
	text-align: center;
}
</style>
</head>
<body>
	<h1>Students</h1>
	<a href="AddStudent">Add</a>
	<table>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>rollNo</td>
			<td>age</td>
			<td>edit</td>
			<td>delete</td>
		</tr>
		<%
			StudentService ss = StudentService.getInstance();
			List<Student> students = ss.getStudents();
			for (Student student : students) {
				out.print("<tr>");
				out.println("<td>" + student.getId() + "</td>");
				out.println("<td>" + student.getName() + "</td>");
				out.println("<td>" + student.getRollNo() + "</td>");
				out.println("<td>" + student.getAge() + "</td>");
				out.println("<td> <form method='post' action='editStud'><input  type='hidden'  name='id' value="
						+ student.getId() + "><input type='submit' value='edit'></form></td>");
				out.println("<td> <form method='post' action='deleteStud'><input  type='hidden'  name='id' value="
						+ student.getId() + "><input type='submit' value='delete'></form></td>");
				out.print("</tr>");
			}
		%>
	</table>
</body>
</html>