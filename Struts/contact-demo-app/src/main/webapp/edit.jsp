<%@page import="com.techlabs.model.Contact"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<%
		Contact contact = (Contact)request.getAttribute("contact");
	%>
		<form action='editCtrl' method='post'>
		<input type='hidden' name='id' value='<%=contact.getId()%>' >
		First Name:
		<input type='text' name='fname' value='<%=contact.getFname() %>'>
		<br>
		Middle Name:
		<input type='text' name='mname' value='<%=contact.getMname() %>'>
		<br>
		Last Name:
		<input type='text' name='lname' value='<%=contact.getLname() %>'>
		<br>
		Phone No:
		<input type='text' name='phoneNo' value='<%=contact.getPhoneNo() %>'>
		<br>
		Email:
		<input type='text' name='email' value='<%=contact.getEmail() %>'>
		
		<br><input type='submit' value='submit'></form>

</body>
</html>