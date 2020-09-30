<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.hsbc.beans.ManagerBean"%>
<%@ page import="com.hsbc.beans.ManagerDao"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Manager</title>
</head>
<body bgcolor="lightgrey">

	<jsp:useBean id="obj" class="com.hsbc.beans.ManagerBean" />
	<jsp:setProperty property="*" name="obj" />
	
	<%
	ManagerDao dao = new ManagerDao();
	List<ManagerBean> lists = dao.display();
	dao.addContact(obj);
	System.out.println(obj);
	request.setAttribute("contacts", lists);
	%>
	
	<hr>
	<table border="1">
		<tr bgcolor="blue">
			<th><b>First Name</b></th>
			<th><b>Last Name</b></th>
			<th><b>Email</b></th>
			<th><b>Telephone</b></th>
			<th></th>
		</tr>

		<c:forEach items="${lists}" var="l">
			<tr>
				<td>${l.firstname}</td>
				<td>${l.lastname}</td>
				<td>${l.email}</td>
				<td>${l.telephone}</td>
				<td><i> delete </i></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>