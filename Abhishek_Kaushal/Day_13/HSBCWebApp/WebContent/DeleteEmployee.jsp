<!DOCTYPE html>
<%@ taglib  prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hsbc.bean.ContactBean , com.hsbc.bean.ContactBeanDao"%>
<%@page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="employeedao" class="com.hsbc.bean.EmployeeBeanDao"></jsp:useBean>
	
	<%
		employeedao.deleteEmployee(request.getParameter("employeeid"));
	%>
	<jsp:forward page="RetrieveEmployees.jsp"></jsp:forward>
</body>
</html>