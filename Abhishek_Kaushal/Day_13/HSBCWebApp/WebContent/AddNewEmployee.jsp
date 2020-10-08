<!DOCTYPE html>
<%@page import= "com.hsbc.bean.*"%>
<%@ taglib  prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form method="post" action="AddNewEmployee.jsp">
		Enter ID: <input type="text" name="id"><br>
		Enter Name: <input type="text" name="name"><br>
		Enter Salary: <input type="number" name="salary"><br>
		Enter Department: <input type="text" name="department"><br>
		<br> <input type="submit" value="Add">
	</form>
	
	<% if(request.getMethod().equals("POST")){ %>
		<jsp:useBean id="employee" class="com.hsbc.bean.EmployeeBean"></jsp:useBean>
		<jsp:setProperty property="*" name="employee"/>
		<jsp:useBean id="employeedao" class="com.hsbc.bean.EmployeeBeanDao"></jsp:useBean>
		<jsp:getProperty property="list" name="employeedao"/>
		
		<%
		employeedao.addEmployee(employee);
		%>
		<jsp:forward page="EmployeeInfoHome.jsp"></jsp:forward>
	<%} %>
</body>
</html>