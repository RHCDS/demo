<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Register</title>
</head>
<body>
	Please Register !
	<form action="register" method="post">
		<table>

			<tr>
				<td>Your Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Your Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
			<tr>
				<td>Your Age:</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form>
</body>
</html>