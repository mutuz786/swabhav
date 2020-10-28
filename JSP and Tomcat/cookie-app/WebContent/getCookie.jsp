<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GetCookie</title>
</head>
<body>
	<%
		Cookie[] cookies = null;
		Cookie cookie = null;
		cookies = request.getCookies();
		if (cookies != null) {
			out.println("<h2>Found Cookies</h2>");
			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];
				if (cookie.getName().equals("color")) {
					out.println("<body style='background-color: " + cookie.getValue() + ";''>");
				}
			}
		} else {
			out.println("<h2>No cookies founds</h2>");
		}
	%>

</body>
</html>