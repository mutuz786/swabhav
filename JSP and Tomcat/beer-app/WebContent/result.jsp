<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recommendations</title>
</head>
<body>
	<h3>Beer Selection Advice</h3>
	<br>
	<h5></h5>
	<%
		String c = request.getParameter("color");
		out.println("Got beer color " + c + "<br>");
		List<String> beers = (List<String>) request.getAttribute("beers");
		for (String beer : beers) {
			out.println("<br>try: " + beer.toUpperCase());
		}
	%>
</body>
</html>