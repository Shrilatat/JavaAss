<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body bgcolor="lightgrey">
<h1>Employee Information System</h1>
	<h3>Please enter the following details =></h3>
	<form method="post" action="emp">
		<table>
			<tr>
				<td>Your Employee ID :</td>
				<td><input type="text" name="eid"></td>
			</tr>
			<tr>
				<td><br>Your name :</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td><br>Your salary :</td>
				<td><input type="text" name="sal"></td>
			</tr>
			<tr>
				<td><br>Your department :</td>
				<td><input type="text" name="dept"></td>
			</tr>
			<br>
			<br>
		</table>
		<br>
			<br>
		<input type="submit" value="Add">
	</form>
</body>
</html>