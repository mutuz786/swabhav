<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Input:
	<form>
		name: <input type="text" name="name"> 
		<input type="submit" value="submit">
	</form>
	Output:
	<%
		out.println("Hello "+request.getParameter("name"));
	%>
</body>
</html>