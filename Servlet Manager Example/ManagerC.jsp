<%@page import="com.hsbc.servletdemo.manEx.ManagerDao"%>
<%@page import="com.hsbc.servletdemo.manEx.Manager"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Contact</title>
</head>
<body>
<h2>Contact Manager</h2>
<form method="post" action="ManagerC.jsp">
First Name : <input type="text" name="fname"><br><br>
	Last Name : <input type="text" name="lname"><br><br>
	Email : <input type="email" name="mail"><br><br>
	Telephone : <input type="text" name="tele"><br><br>
	<input type="submit" value="send">
</form>

	<jsp:useBean id="m1" class="com.hsbc.servletdemo.manEx.Manager"></jsp:useBean>
	<jsp:setProperty property="*" name="m1"/>
	<%
	ManagerDao dao=new ManagerDao();
	List<Manager> list=dao.addManager(m1);
	pageContext.setAttribute("list",list);
	out.print(list);
	%> 
	<table border=1 width=50% height=20%>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>email</th>
		<th>Telephone</th>
		<th>remove</th>
	</tr> 
	
	<c:forEach items="${list}" var="man">
	<tr><td>${man.fname}</td>
	<td>${man.lname}</td>
	<td>${man.mail}</td>
	<td>${man.tele}</td></tr> 
	</c:forEach>
	
	</table>
	
	
	
	

</body>
</html>