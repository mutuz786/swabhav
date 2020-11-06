<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<%
		String path = (String) request.getAttribute("path");
		String query = (String) request.getAttribute("query");	
	%>
	<center>
		<h2>Login Page</h2>
		<form action="loginCtrl" method="post">
			<input type="hidden" name="path" value="<%=path%>"> 
			<input type="hidden" name="query" value="<%=query%>"> 
			<input type="text" name="uname" placeholder="Username"> <br> <br>
			<input type="password" name="pword" placeholder="Password"><br> <br> 
			<input type="submit" value="Login">
		</form>
	</center>
</body>
</html>