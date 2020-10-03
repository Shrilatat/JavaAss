<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greeting !</title>
</head>
<body bgcolor = "lightblue">

	<%
	
	String str = request.getParameter("t1");
		java.util.Date d1 = new java.util.Date();
	int hour = d1.getHours();

	if (hour < 12)
		out.print("Good Morning! " + str);
	else if (hour < 17 && hour >= 12 )
		out.print("Good Afternoon! " + str);
	else 
		out.print("Good Evening! " + str);
	%>
</body>
</html>