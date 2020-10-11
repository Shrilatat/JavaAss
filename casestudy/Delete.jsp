<!DOCTYPE html>
<%@ page import="com.hsbc.Dao.EmployeeDao,java.util.*,com.hsbc.bean.Employee" %>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>


	<jsp:useBean id="e" class="com.hsbc.bean.Employee"/>
	<jsp:setProperty property="*" name="e"/>
	
	<%
	EmployeeDao dao = new EmployeeDao();
	dao.deleteEmployee(e);
	%>
	
	<jsp:forward page="DisplayEmployee.jsp"></jsp:forward>
</body>
</html>