<%@page import="com.techlab.model.RegisterDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Login</title>
</head>

<body>
    <form action="register" method="post">
        First Name: <input type="text" name="fname"><br>
        Last Name: <input type="text" name="lname"><br>
        Address: <input type="text" name="address"><br>
        Email: <input type="text" name="email"><br>
        <input type="submit" value="Submit"><br>
    </form>
    <%
		String[] info=RegisterDB.getData();
    	if(info!=null){
    		out.print("<br>Id:"+info[0]);
    		out.print("<br>First Name:"+info[1]);
    		out.print("<br>Last Name:"+info[2]);
    		out.print("<br>Address:"+info[3]);
    		out.print("<br>Email:"+info[4]);	
    	}
    %>
</body>

</html>