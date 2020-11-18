<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TaskList</title>
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
<body class="jumbotron">
	<h2 class="display-4">Home Page</h2>
	<hr class="my-4">
	<ul class="nav nav-pills">
		<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
		<li class="nav-item"><a class="nav-link" href="addUser">Add</a></li>
	</ul>
	<hr class="my-4">
	<table class="table table-dark">
		<tr>
			<th scope="col">ID</th>
			<th scope="col">FIRST NAME</th>
			<th scope="col">LAST NAME</th>
			<th scope="col">EMAIL</th>
			<th scope="col">USERNAME</th>
			<th scope="col">PASSWORD</th>
			<th scope="col">TASKS</th>
			<th scope="col">EDIT</th>
			<th scope="col">DELETE</th>
		</tr>
		<s:iterator value="users">
			<tr class="hover-class">
				<td><s:property value="id" /></td>
				<td><s:property value="firstName" /></td>
				<td><s:property value="lastName" /></td>
				<td><s:property value="email" /></td>
				<td><s:property value="username" /></td>
				<td><s:property value="password" /></td>
				<td><s:form action="task" method="get">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Tasks" class="btn btn-primary btn-lg" />
					</s:form></td>
				<td><s:form action="editUser" method="get">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Edit" class="btn btn-primary btn-lg" />
					</s:form></td>
				<td><s:form action="deleteUser.do" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Delete" class="btn btn-primary btn-lg" />
					</s:form></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>