<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	
	<%@ page import="com.hsbc.dao.LoginDao" %>

	<%
	if(request.getMethod().equals("POST")){
		LoginDao dao = new LoginDao();
		if(dao.verify(request.getParameter("username"),request.getParameter("password"))){
			%>
			<jsp:forward page="index.jsp"/>
		<%
		}else{
		%>
			<c:out value="Invalid Credentials !!"></c:out>
		<%
		}}
		%>
	
</body>
</html>