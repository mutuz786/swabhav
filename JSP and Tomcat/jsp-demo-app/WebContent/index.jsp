<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int number = 10;
		if(number%2==0){
			out.println("The number is even");
		}else{
			out.println("The number iis odd");
		}
	%>

</body>
</html>