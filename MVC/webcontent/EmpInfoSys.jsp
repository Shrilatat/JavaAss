<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Info System</h1>
<%
	String uname=(String)request.getAttribute("username");	
%>
<h2>Welcome  &nbsp;<%=uname%></h2>
<form method="get" action="empregisterServlet">
<a href="addNewEmployee.jsp">Add new Employee</a><br/>
<a href="empregisterServlet?allemp">Retrieve All Employee records</a>
</form>
</body>
</html>