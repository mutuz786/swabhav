<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
<style type="text/css">
table {
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #d7e4db;
	background-color: rgb(9, 214, 77);
	text-align: center;
	padding: 10px;
}

td {
	background-color: rgb(255, 255, 255);
}
</style>
</head>
<body>
	<h2>Home Page</h2>
	<table>
		<tr>
			<td>Roll No</td>
			<td>Name</td>
			<td>Address</td>
			<td>Age</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<s:iterator value="students">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="address" /></td>
				<td><s:property value="age" /></td>
				<td><s:form action="editForm" method="get">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Edit" />
					</s:form></td>
				<td><s:form action="deleteStudent" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Delete" />
					</s:form></td>
			</tr>
		</s:iterator>
	</table>
	<a href="addForm">Add</a>
	<a href="logout">Logout</a>
</body>
</html>