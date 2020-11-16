<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
.errorMessage {
	color: red;
}
</style>
</head>
<body>
	<form action="registerData">
		Enter Name:<input type="text" name="name" /> <br> Enter Email<input
			type="text" name="email" /><br>Enter Username: <input
			type="text" name="username" /><br>Enter Password: <input
			type="password" name="password" /><br>Confirm Password: <input
			type="password" name="passwordRepeat" /><br>
		<botDetect:captcha id="exampleCaptcha" userInputID="captchaCode" />
		Enter Captcha: <input type="password" name="captchaCode" /><br> <input
			type="submit" value="Register" />
	</form>
</body>
</html>