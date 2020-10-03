<!DOCTYPE html>
<%@page import="com.hsbc.bean.EmployeeValidateDao"%>
<%@ taglib  prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="validateDao" class="com.hsbc.bean.EmployeeValidateDao"></jsp:useBean>
	<%
		if(validateDao.validate(request.getParameter("username"), request.getParameter("password"))){

		%>

			<jsp:forward page="EmployeeInfoHome.jsp"></jsp:forward>
		
		<%}
	else {%>
		<jsp:forward page="EmployeeInfoLogin.jsp"></jsp:forward>
	<%} %>
</body>
</html>