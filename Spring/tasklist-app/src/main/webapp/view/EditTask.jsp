<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TaskList</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="headerScript"></script>
<link rel="stylesheet" href="style">

</head>
<body>
	<div id="header"></div>
	<br>
	<ul class="nav nav-pills">
		<li class="nav-item"><a class="nav-link" href="task">Back</a></li>
	</ul>
	<br>
	<div align="center">
		<s:form action="editTask.do" method="post">
			<s:hidden name="id" value="%{editVM.id}" />
			<s:textfield name="title" value="%{title}" label="Enter Title"
				class="form-control" />

			<s:submit value="Edit" class="btn btn-primary" />
		</s:form>
	</div>
</body>
</html>