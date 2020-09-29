<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Date d=new Date();
if(d.getHours()>0 && d.getHours()<12)
	out.print("GOOD MORNING!");
else if(d.getHours()>12 && d.getHours()<16)
	out.print("GOOD AFTERNOON!");
else
	out.print("GOOD EVENING!");

%>

</body>
</html>