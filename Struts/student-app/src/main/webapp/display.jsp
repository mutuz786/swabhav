<%@page import="com.techlab.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<style type="text/css">
td, th, s:submit {
	text-align: center;
	padding: 10px;
}

.hover-class:hover {
	background: #ccc;
	color: #fff;
}
</style>
</head>
<body class="jumbotron">
	<h2 class="display-4">Home Page</h2>
	<hr class="my-4">
	<ul class="nav nav-pills">
		<li class="nav-item"><a class="nav-link" href="addForm">Add</a></li>
		<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
	</ul>
	<hr class="my-4">
	<table class="table table-borderless table-dark">
		<tr>
			<th scope="col">ID</th>
			<th scope="col">NAME</th>
			<th scope="col">AGE</th>
			<th scope="col">EMAIL</th>
			<th scope="col">CGPA</th>
			<th scope="col">EDIT</th>
			<th scope="col">DELETE</th>
		</tr>
		<s:iterator value="students">
			<tr class="hover-class">
				<td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="age" /></td>
				<td><s:property value="email" /></td>
				<td><s:property value="cgpa" /></td>
				<td><s:form action="editForm" method="get">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Edit" class="btn btn-primary btn-lg" />
					</s:form></td>
				<td><s:form action="deleteStudent" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Delete" class="btn btn-primary btn-lg" />
					</s:form></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>