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
</style>
</head>
<body class="jumbotron">
	<h2 class="display-4">Tasks</h2>
	<hr class="my-4">
	<ul class="nav nav-pills">
		<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
		<li class="nav-item"><a class="nav-link" href="home">Back</a></li>
		<li class="nav-item"><a class="nav-link" href="addTask">Add</a></li>
	</ul>
	<hr class="my-4">
	<table class="table table-dark">
		<tr>
			<th scope="col">CHECKED</th>
			<th scope="col">TITLE</th>
			<th scope="col">DATE</th>
			<th scope="col">SUBTASK</th>
			<th scope="col">EDIT</th>
			<th scope="col">DELETE</th>
		</tr>
		<s:iterator value="tasks">
			<tr class="hover-class">
				<td><s:form action="task.check" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:checkbox theme="simple" name="done" fieldValue="%{done}"
							onChange="this.form.submit()" />
					</s:form></td>
				<td><s:property value="title" /></td>
				<td><s:property value="date" /></td>
				<td><s:form action="subTask" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="SubTasks" class="btn btn-primary btn-lg" />
					</s:form></td>
				<td><s:form action="editTask" method="get">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Edit" class="btn btn-primary btn-lg" />
					</s:form></td>
				<td><s:form action="deleteTask.do" method="post">
						<s:hidden name="id" value="%{id}" />
						<s:submit value="Delete" class="btn btn-primary btn-lg" />
					</s:form></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>