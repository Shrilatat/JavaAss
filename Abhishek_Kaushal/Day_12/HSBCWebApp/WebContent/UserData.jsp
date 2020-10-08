<!DOCTYPE html>
<%@page import="com.hsbc.bean.UserBean , com.hsbc.bean.UserBeanDao"%>
<%@ taglib  prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method = "post" action = "UserData.jsp">
		Username: <input type="text" name="username"><br><br>
		Password: <input type="password" name="password"><br><br>
		Email: <input type="email" name="email"><br><br>
		Gender: <input type="radio" name="gender" value="Male">Male
		<input type="radio" name="gender" value="Female">Female <br><br>
		Age: <input type="number" name="age"><br><br>
		Address: <textarea rows="4" name = "address"></textarea><br><br>
		Contact Number: <input type="number" name="phone"><br><br>
		
		<input type = "submit" value="Submit">
		<input type = "reset" value="Reset"><br>
	</form>
	

		<% if(request.getMethod().equals("POST")){%>
		<jsp:useBean id="user" class = "com.hsbc.bean.UserBean"></jsp:useBean>
		<jsp:useBean id="dao" class = "com.hsbc.bean.UserBeanDao"></jsp:useBean>
		<jsp:setProperty property="*" name="user"/>
		<jsp:getProperty property="list" name="dao"/>
		<%
		dao.addUser(user);
		List<UserBean> list = dao.showUserTable();
		pageContext.setAttribute("list",list);
		%>

	<table border="1">
		<tr>
			<th>UserName</th>
			<th>Password</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Age</th>
			<th>Address</th>
			<th>Phone</th>
			
		</tr>
		<c:forEach items="${list}" var="con">
			<tr>
				<td>${con.username}</td>
				<td>${con.password}</td>
				<td>${con.email}</td>
				<td>${con.gender}</td>
				<td>${con.age}</td>
				<td>${con.address}</td>
				<td>${con.phone}</td>
			</tr>
		</c:forEach>
	</table>
	
	<% }
		%>
	
	
</body>
</html>