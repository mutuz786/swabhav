<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Sucess</title>
</head>
<body>
	<%
		if (request.getAttribute("result").equals("pass")) {
			out.println("<h2>Welcome " + request.getParameter("uname") + "</h2>");
			out.println("<a href='login.html'>Logout</a>");
		}
	%>
</body>
</html>