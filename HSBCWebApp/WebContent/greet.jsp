<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date d= new Date();
		if(d.getHours()>1 && d.getHours()<12)
			out.write("Good Morning");
		else if(d.getHours()>=12 && d.getHours()<18)
			out.write("Good day");
		else 
			out.write("Good evening");
	%>
</body>
</html>