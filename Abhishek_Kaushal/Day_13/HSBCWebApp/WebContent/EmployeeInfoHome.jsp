<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Employee Information System</h1>
	<h2>Welcome, <%= request.getParameter("username") %></h2><br><br>
	
	<a href = "AddNewEmployee.jsp">Add new employee..</a><br><br>
	<a href = "RetrieveEmployees.jsp">Retrieve all employees..</a>
</body>
</html>