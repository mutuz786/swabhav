<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application</title>
</head>
<body>
	<%
		if (application.getAttribute("oldCountA") == null) {
			application.setAttribute("oldCountA", new Integer(0));
			application.setAttribute("newCountA", new Integer(1));
		}
		out.println("Old:" + application.getAttribute("oldCountA"));
		out.println("<br>New:" + application.getAttribute("newCountA"));
		out.println("<br>Id:" + session.getId());

		application.setAttribute("oldCountA", ((Integer) application.getAttribute("oldCountA")) + 1);
		application.setAttribute("newCountA", ((Integer) application.getAttribute("newCountA")) + 1);
	%><br>
	<br>
	<a href="summary.jsp">Summary</a>
</body>
</html>