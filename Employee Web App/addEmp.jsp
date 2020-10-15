<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Manager</title>
</head>
<body>

	<h1>Employee Manager</h1>
	<form method="POST" action="addEmp.jsp">
		Enter Employee ID :<input type="text" name="id"><br><br>
		Enter Employee Name :<input type="text" name="name"><br><br>
		Enter Salary :<input type="number" name="sal"><br><br>
		Enter Department :<input type="text" name="dept"><br><br>
		<input type="submit"><br><br>
		<a href="dispEmp.jsp">Display All Employees</a>		
		
	</form>

<%@ page import="com.hsbc.dao.EmployeeDao,java.util.*,com.hsbc.bean.Employee" %>

	<jsp:useBean id="e" class="com.hsbc.bean.Employee"/>
	<jsp:setProperty property="*" name="e"/>
	
	<%
	if(request.getMethod().equals("POST")){
		EmployeeDao dao = new EmployeeDao();
		dao.addEmployee(e);
	}
	%>
	
	
</body>
</html>