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
		<li class="nav-item"><a class="nav-link" href="user">Back</a></li>
	</ul>
	<br>
	<div align="center">
		<s:form action="editUser.do" method="post"
			enctype="multipart/form-data">
			<s:hidden name="id" value="%{editUserVM.id}" />
			<s:textfield name="firstName" value="%{editUserVM.firstName}"
				label="Enter First Name" class="form-control" />

			<s:textfield name="lastName" value="%{editUserVM.lastName}"
				label="Enter Last Name" class="form-control" />

			<s:textfield name="email" value="%{editUserVM.email}"
				label="Enter Email" class="form-control" />

			<s:textfield name="username" value="%{editUserVM.username}"
				label="Enter Username" class="form-control" />

			<s:password name="password" value="%{editUserVM.password}"
				label="Enter Password" class="form-control" />
				
			<s:file name="img" label="Enter Profile Picture" class="validate" />

			<s:submit value="Edit" class="btn btn-primary" />
		</s:form>
	</div>
</body>
</html>