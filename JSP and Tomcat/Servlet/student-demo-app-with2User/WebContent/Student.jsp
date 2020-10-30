<%@page import="com.techlab.model.LoginCheck"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@page import="com.techlab.service.StudentService"%>
<%@page import="com.techlab.model.Student"%>
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
	<h1>Welcome</h1>
	<table>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>rollNo</td>
			<td>age</td>
			<%
				if (LoginCheck.isAdmin(request)) {
					out.print("<td>edit</td><td>delete</td>");
				}
			%>

		</tr>
		<%
			ArrayList<Student> entries = StudentService.getStudents();
			for (Student entry : entries) {
				out.print("<tr>");
				out.println("<td>" + entry.getId() + "</td>");
				out.println("<td>" + entry.getName() + "</td>");
				out.println("<td>" + entry.getRollNo() + "</td>");
				out.println("<td>" + entry.getAge() + "</td>");
				if (LoginCheck.isAdmin(request)) {
					out.println("<td> <a href='editStud?id=" + entry.getId() + "'>edit</a></td>");
					out.println("<td> <a href='deleteStud?id=" + entry.getId() + "'>delet</a></td>");
				}
				out.print("</tr>");
			}
		%>
	</table>
	<%
		if (LoginCheck.isAdmin(request)) {
			out.print("	<a href='AddStudent'>Add</a>");
			out.print("<br><a href='Logout'>Logout</a>");
		} else {
			out.print("<a href='Login'>Login</a>");
		}
	%>


</body>
</html>