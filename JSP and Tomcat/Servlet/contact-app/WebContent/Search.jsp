<%@page import="com.techlab.model.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
<style type="text/css">
table, tr, td, th {
	border: 1px solid black;
	text-align: center;
}
</style>
</head>
<body>
	<form action="SearchC" method="post">
		<h4>Choose:</h4>
		<select name="cond">
			<option value="fname">First Name</option>
			<option value="mname">Middle Name</option>
			<option value="lname">Last Name</option>
			<option value="phoneNo">Phone No</option>
			<option value="email">Email</option>
		</select>
		<h4>Value:</h4>
		<input type="text" name="condValue"> <input type="submit"
			value="Search">
	</form>
	<br>
	<br>
	<%
		List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");
		if (contacts != null) {
			out.println("<table><tr>" + "<th>id</th>" + "<th>First Name</th>" + "<th>Middle Name</th>"
					+ "<th>Last Name</th>" + "<th>Phone No</th>" + "<th>Email</th></tr>");
			for (Contact contact : contacts) {
				out.print("<tr>");
				out.println("<td>" + contact.getId() + "</td>");
				out.println("<td>" + contact.getFname() + "</td>");
				out.println("<td>" + contact.getMname() + "</td>");
				out.println("<td>" + contact.getLname() + "</td>");
				out.println("<td>" + contact.getPhoneNo() + "</td>");
				out.println("<td>" + contact.getEmail() + "</td>");
				out.print("</tr>");
			}
			out.print("</table>");
		}
	%>
</body>
</html>