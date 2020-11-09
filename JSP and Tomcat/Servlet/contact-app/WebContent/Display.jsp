<%@page import="com.techlab.service.ContactService"%>
<%@page import="com.techlab.model.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
<style>
table, tr, td, th {
	border: 1px solid black;
	text-align: center;
}
</style>

</head>
<body>
	<h1>Contacts</h1>
	<table>
		<tr>
			<th>id</th>
			<th>First Name</th>
			<th>Middle Name</th>
			<th>Last Name</th>
			<th>Phone No</th>
			<th>Email</th>
			<th>edit</th>
			<th>delete</th>
		</tr>
		<%
			ContactService cs = ContactService.getInstance();
			for (Contact contact : cs.getContacts()) {
				out.print("<tr>");
				out.println("<td>" + contact.getId() + "</td>");
				out.println("<td>" + contact.getFname() + "</td>");
				out.println("<td>" + contact.getMname() + "</td>");
				out.println("<td>" + contact.getLname() + "</td>");
				out.println("<td>" + contact.getPhoneNo() + "</td>");
				out.println("<td>" + contact.getEmail() + "</td>");
				out.println("<td> <form method='post' action='Edit'><input  type='hidden'  name='id' value="
						+ contact.getId() + "><input type='submit' value='edit'></form></td>");
				out.println("<td> <form method='post' action='DeleteC'><input  type='hidden'  name='id' value="
						+ contact.getId() + "><input type='submit' value='delete'></form></td>");
				out.print("</tr>");
			}
		%>
	</table>
	<a href="AddContact">Add</a>
</body>
</html>