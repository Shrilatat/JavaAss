<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- This is HTML comment -->
<h1> Welcome to JSP!!</h1>
<%-- This is JSP comment(will not come on browser source code --%>
<%--
	java.util.Date d=new java.util.Date();
	out.println(d);
--%>
<% 
int v1=Integer.parseInt(request.getParameter("uname1"));
int v2=Integer.parseInt(request.getParameter("uname2"));
int v3=v1+v2;
out.println(v3); 
%>
</body>
</html>