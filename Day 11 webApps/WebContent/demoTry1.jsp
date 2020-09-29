<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greeting !</title>
</head>
<body bgcolor = "lightgrey">

	<h1>Welcome to main JSP page.</h1>
	<p>This is paragraph in main JSP.</p>
	
	<%@ include file="demoTry2.jsp" %>
	
	<h4>This is main JSP header 4.</h4>
	
	<%@ include file="add.html"  %>
</body>
</html>