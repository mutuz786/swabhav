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

<script>
	$(document).ready(function () {
		var obj;
		var validEmail,validUname;
		var validInput;
		$.ajax({
            url : '<s:url action="json/userJson" />',
            success : function(data) {
              obj = data.users;
            }
          });
		$("#email").keyup(function () {
			$("#eErr").hide();
			for (var i = 0; i < obj.length; i++) {
				if ($("#email").val() == obj[i].email) {
					validEmail = false;
					$("#eErr").show();
					refresh();
					return
				}
			}
			validEmail = true;
			refresh();
		})
		$("#username").keyup(function () {
			$("#uErr").hide()
			for (var i = 0; i < obj.length; i++) {
				if ($("#username").val() == obj[i].username) {
					validUname = false;
					$("#uErr").show();
					refresh();
					return
				}
			}
			validUname = true;
			refresh();
		})
		$(".form-control").keyup(function () {
			var elements = $(".form-control").toArray()
			for (var i = 0; i < elements.length; i++) {
				if (elements[i].value == "") {
					validInput = false;
					refresh();
					return;
				}
			}
			validInput = true;
			refresh();
		})
		function refresh() {
			if (validInput && validEmail && validUname)
				$("#submitBtn").attr('disabled', false);
			else
				$("#submitBtn").attr('disabled', true);
		}
	})
</script>

</head>
<body>
	<div id="header"></div>

	<br>
	<div align="center">
		<h3>Register</h3>
		<hr class="my-4">
		<br>
		<p class="alert alert-danger" style="display: none" id="uErr">Username
			already taken</p>
		<p class="alert alert-danger" style="display: none" id="eErr">Email
			already taken</p>
		<s:form action="register.do" method="post">
			<s:textfield name="firstName" label="Enter First Name"
				class="form-control" />
			<s:textfield name="lastName" label="Enter Last Name"
				class="form-control" />
			<s:textfield name="email" label="Enter Email" class="form-control"
				id="email" />
			<s:textfield name="username" label="Enter Username"
				class="form-control" id="username" />
			<s:password name="password" label="Enter Password"
				class="form-control" />
			<s:password name="confirmPassword" label="Confirm Password"
				class="form-control" />
			<tr>
				<td align="center"><botDetect:captcha id="capthcaFile"
						userInputID="captchaCode" /></td>
			</tr>
			<s:textfield name="captchaCode" label="Enter Captcha"
				class="form-control" />
			<s:submit value="Register" class="btn btn-primary" id="submitBtn"
				disabled="true" />
		</s:form>
	</div>


</body>
</html>