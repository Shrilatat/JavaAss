<!DOCTYPE html>
<%@ taglib  prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hsbc.bean.ContactBean , com.hsbc.bean.ContactBeanDao"%>
<%@page import="java.util.*"%>
<html>
<head>
<title>Contact Manager</title>
</head>
<body>

	<form method="post" action="ContactManager.jsp">
		<h1>Contact Manager</h1>
		First Name: <input type="text" name="fname"><br>
		Last Name: <input type="text" name="lname"><br>
		Telephone: <input type="number" name="phone"><br>
		Email: <input type="email" name="email"><br>
		<input type = "submit" value="Add Contact">
	</form>


	<jsp:useBean id="contact" class="com.hsbc.bean.ContactBean"></jsp:useBean>
	<jsp:useBean id="dao" class="com.hsbc.bean.ContactBeanDao"></jsp:useBean>
	<jsp:setProperty property="*" name="contact"/>
	<jsp:getProperty property="list" name="dao"/>
<%
		List<ContactBean> list = dao.getList();
		pageContext.setAttribute("list",list);
		//list.remove(list.size()-1);
		list.add(contact);
		dao.setList(list);
%>

	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Telephone</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${list}" var="con">
			<tr>
				<td>${con.fname}</td>
				<td>${con.lname}</td>
				<td>${con.phone}</td>
				<td>${con.email}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>