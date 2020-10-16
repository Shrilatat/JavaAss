<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int a = Integer.parseInt(request.getParameter("n1"));
	int b = Integer.parseInt(request.getParameter("n1"));
	int c = a + b;
%>
<h1>The addition is <%= c %></h1>
</body>
</html>