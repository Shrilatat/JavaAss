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
	java.util.Date d= new java.util.Date();
	if(d.getHours()<12)
		out.println("good morning");
	else if(d.getHours()>12 && d.getHours()<18)
		out.println("good afternoon");
	else
		out.println("good evening");
	
%>
</body>
</html>