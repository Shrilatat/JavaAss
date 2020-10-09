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
	String name =  request.getParameter("uname");

	java.util.Date d =  new java.util.Date();
	if(d.getHours() < 12)
		out.println("Good morning! " + name);
	if(d.getHours() > 12 && d.getHours() <18)
		out.println("Good day! " + name);
	else
		out.println("Good eve! " + name);
	
%>

</body>
</html>