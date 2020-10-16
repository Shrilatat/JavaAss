<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP page</title>
</head>
<body>
<!-- This is an html comment -->
	<h1>Welcome to JSP!!!</h1>

	<%= "<h1> The sum is "+(Integer.parseInt(request.getParameter("t1"))+Integer.parseInt(request.getParameter("t2")))+"</h1>"%>
		<!-- java.util.Date d1 = new java.util.Date(); -->
		<!-- out.println(d1); -->

</body>
</html>