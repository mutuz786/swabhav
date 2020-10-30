<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login failed</title>
</head>
<body>
	<%
		out.println("<h2>Wrong username or password</h2>");
		out.println("<a href='login.jsp'>Logout</a>");
	%>
</body>
</html>
