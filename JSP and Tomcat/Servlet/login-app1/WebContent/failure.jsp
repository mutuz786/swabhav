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
		if (request.getAttribute("result").equals("fail")) {
			out.println("<h2>Wrong username or password</h2>");
			out.println("<a href='login.html'>Logout</a>");
		}
	%>
</body>
</html>
