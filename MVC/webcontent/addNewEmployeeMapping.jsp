<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.hsbc.bean.EmployeeRegisterationbeans" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userbean" class="com.hsbc.bean.EmployeeRegisterationbeans"/>
<jsp:setProperty property="*" name="userbean"/>
<form action="newempaddServlet">
</form>
</body>
</html>