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
td, th {
	text-align: center;
	padding: 10px;
}
</style>
</head>
<body>
	<h2>Home Page</h2>
	<table class="table table-striped table-dark">
		<tr>
			<th scope="col">Id</th>
			<th scope="col">Name</th>
			<th scope="col">Post</th>
			<th scope="col">Salary</th>
			<th scope="col">Date Of Joining</th>
			<th scope="col">Department</th>
			<th scope="col">Edit</th>
			<th scope="col">Delete</th>
		</tr>
		<s:iterator value="employees">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="post" /></td>
				<td><s:property value="sal" /></td>
				<td><s:property value="doj" /></td>
				<td><s:property value="dept" /></td>
				<td><s:form action="editForm" method="get">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Edit" class="btn btn-primary btn-lg" />
					</s:form></td>
				<td><s:form action="deleteEmployee" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Delete" class="btn btn-primary btn-lg" />
					</s:form></td>
			</tr>
		</s:iterator>
	</table>
	<a href="addForm" class="btn btn-outline-dark">Add</a>
	<a href="logout" class="btn btn-outline-dark">Logout</a>
</body>
</html>