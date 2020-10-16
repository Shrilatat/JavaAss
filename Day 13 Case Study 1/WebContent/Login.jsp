<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

</head>
<body bgcolor="lightgrey">
	<h1>Employee Information System</h1>
	<form method="post" action="controller">
		<table>
			<tr>
				<td>Please enter your user name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><br> Enter password :</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<br>
			<br>
		</table>
		<br>
		<br>
		<input type="submit" value="Login">
	</form>
	
</body>
</html>