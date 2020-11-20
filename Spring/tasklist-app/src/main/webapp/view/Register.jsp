<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>
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
</head>
<body>
	<div id="header"></div>

	<br>
	<div align="center">
		<h3>Register</h3>
		<hr class="my-4">
		<br>
		<s:form action="register.do" method="post">
			<s:textfield name="firstName" label="Enter First Name"
				class="form-control" required="true" />
			<s:textfield name="lastName" label="Enter Last Name"
				class="form-control" required="true" />
			<s:textfield name="email" label="Enter Email" class="form-control"
				required="true" />
			<s:textfield name="username" label="Enter Username"
				class="form-control" required="true" />
			<s:password name="password" label="Enter Password"
				class="form-control" required="true" />
			<s:password name="confirmPassword" label="Confirm Password"
				class="form-control" required="true" />
			<tr>
				<td align="center"><botDetect:captcha id="capthcaFile"
						userInputID="captchaCode" /></td>
			</tr>
			<s:textfield name="captchaCode" label="Enter Captcha"
				class="form-control" required="true" />
			<s:submit value="Register" class="btn btn-primary" />
		</s:form>
	</div>


</body>
</html>