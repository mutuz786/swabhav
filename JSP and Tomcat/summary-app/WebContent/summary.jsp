<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Summary</title>
</head>
<body>
	<h1>
		<%
			out.println("Session count:" + session.getAttribute("newCountS"));
			out.println("<br>Application count:" + application.getAttribute("newCountA"));
		%><br>
	</h1>
	<a href="session.jsp">Session</a>
	<a href="application.jsp">Application</a>

</body>
</html>