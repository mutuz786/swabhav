<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SetCookie</title>

</head>
<body>
	
	<%
		Cookie cookie = new Cookie("color", "red");
		cookie.setMaxAge(60 * 60 * 24);
		response.addCookie(cookie);
		if(cookie!=null){
			out.println("<h2>Cookie created</h2>");
		}
	%>
	<a href="getCookie.jsp">view</a>
</body>
</html>