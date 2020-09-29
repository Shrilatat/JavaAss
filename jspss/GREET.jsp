<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wishes</title>
</head>
<body>
<%@ page import="java.util.*" %>
<%
Date d=new Date();
if(d.getHours()<12 && d.getHours()>0)
	out.print("Good morning.");
else if(d.getHours()>12 && d.getHours()<16)
	out.print("Good Afternoon.");
else
	out.print("Good evening.");
%>
</body>
</html>