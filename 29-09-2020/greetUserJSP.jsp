<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greet User</title>
</head>
<body>
	<% java.util.Date d=new java.util.Date(); %>>
	<h1>The time is <%= d.getHours() %>></h1>
	<%  String message = null;
		int hour = d.getHours();
				
		if(hour < 13)
			out.println("Good Morning");
		else
			out.println("Good Evening");
	%>
</body>
</html>