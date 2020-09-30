<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.hsbc.beans.UserDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User JSP</title>
</head>
<body>
<h1>Hey!</h1>

<jsp:useBean id="uI" class="com.hsbc.beans.User"/>
<jsp:setProperty property="*" name="uI"/>

<!-- The username is : <jsp:getProperty property="username" name="uI"/> -->
Details :
<% out.println(uI); %>

<% UserDao dao = new UserDao();
dao.addUser(uI);
%>


</body>
</html>