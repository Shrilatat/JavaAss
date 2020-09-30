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
	String n = "mauli";
	String p = "aaa";
	String name = request.getParameter("uname");
	String pass = request.getParameter("pass");
	if(n.equals(name) && p.equals(pass))
	{
	%>
		<jsp:forward page="valid.jsp" /> 
	<% } 
	else{ %>
		<jsp:forward page="invalid.jsp" /> 
<%} %>


</body>
</html>