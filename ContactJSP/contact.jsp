<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Manager</title>
</head>
<body>

	<h1>Contact Manager</h1>
	<form method="get" action="contact.jsp">
		Enter First Name :<input type="text" name="first"><br><br>
		Enter Last Name :<input type="text" name="last"><br><br>
		Enter Email :<input type="email" name="email"><br><br>
		Enter Telephone :<input type="number" name="phone"><br><br>
		<input type="submit"><br><br>
		<hr>
	</form>

<%@ page import="com.hsbc.dao.ContactDao, java.util.*, com.hsbc.bean.Contact" %>

	<jsp:useBean id="c" class="com.hsbc.bean.Contact"/>
	<jsp:setProperty property="*" name="c"/>
	
	<%
	ContactDao dao = new ContactDao();
	List<Contact> contacts = dao.display();
	dao.addContact(c);
	System.out.println(c);
	request.setAttribute("contacts", contacts);
	%>

	<table border=1>
	<tr><th>First Name</th><th>Last Name</th><th>Email</th><tr><th>Phone</th></tr>
    <c:forEach items="${contacts}" var="contact">
        <tr>
            <td>${contact.first}</td>
            <td>${contact.last}</td>
            <td>${contact.email}</td>
            <td>${contact.phone}</td>
        </tr>
    </c:forEach>
	</table>
</body>
</html>