<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
<%@ page import="com.hsbc.dao.EmployeeDao,java.util.*,com.hsbc.bean.Employee" %>

	<jsp:useBean id="e" class="com.hsbc.bean.Employee"/>
	<jsp:setProperty property="*" name="e"/>
	
	<%
	EmployeeDao dao = new EmployeeDao();
	dao.deleteEmployee(e);
	%>
	
	<jsp:forward page="displayEmp.jsp"></jsp:forward>
</body>
</html>