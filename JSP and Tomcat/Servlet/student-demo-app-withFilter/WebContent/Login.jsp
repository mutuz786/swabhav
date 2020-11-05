<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%
		String destination = (String) request.getAttribute("destination");
		if (destination == null) {
			destination = "validate";
		}
		out.print("<form action='" + destination + "' method='post'>");
	%>

	Username:	
	<input type="text" name="uname">
	<br> 
	Password:
	<input type="password" name="pword">
	<br>
	<input type="submit" value="Login">
	</form>
</body>
</html>