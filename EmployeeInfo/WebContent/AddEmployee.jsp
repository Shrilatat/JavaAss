
<!DOCTYPE html>
<%@page import="com.hsbc.employeeinfo.GetEmpDetailsFromDB"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.hsbc.employeeinfo.EmployeeDao"%>
<%@page import="com.hsbc.employeeinfo.Employee"%>
<%@page import="java.util.*"%>
<html>
<head>
</head>
<body>
	<jsp:useBean id="e" class="com.hsbc.employeeinfo.Employee"></jsp:useBean>
	<jsp:setProperty property="*" name="e" />
	<%
		EmployeeDao dao = new EmployeeDao();
		
		dao.addEmployee(e);
		
	%>
	<jsp:forward page="AccessPage.html"></jsp:forward>
</body>
</html>