<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Employee Info</h1>
<form method="get" action="addNewEmployeeMapping.jsp">
	<table>
		<tr>
			<td>Enter ID</td>
			<td><input type=text name="id"></td>
		</tr>
		<tr>
			<td>Enter Name</td>
			<td><input type=text name="name"></td>
			
		</tr>
		<tr>
			<td>Enter Salary</td>
			<td><input type=text name="salary"></td>
			
		</tr>
		<tr>
			<td>Enter Department</td>
			<td><input type=text name="department"></td>
			
		</tr>
	</table>
	<input type=submit  value="Add">
</form>
</body>
</html>