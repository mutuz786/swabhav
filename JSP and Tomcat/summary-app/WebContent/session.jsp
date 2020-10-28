<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session</title>
</head>
<body>

	<%
		if (session.isNew()) {
			session.setAttribute("oldCountS", new Integer(0));
			session.setAttribute("newCountS", new Integer(1));
		}
		out.println("Old:" + session.getAttribute("oldCountS"));
		out.println("<br>New:" + session.getAttribute("newCountS"));
		out.println("<br>Id:" + session.getId());

		session.setAttribute("oldCountS", ((Integer) session.getAttribute("oldCountS")) + 1);
		session.setAttribute("newCountS", ((Integer) session.getAttribute("newCountS")) + 1);
	%><br>
	<br>
	<a href="summary.jsp">Summary</a>
</body>
</html>