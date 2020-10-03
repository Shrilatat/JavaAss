<!DOCTYPE html>
<%@page import= "com.hsbc.bean.*"%>
<%@ taglib  prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="employee" class="com.hsbc.bean.EmployeeBean"></jsp:useBean>
		<jsp:setProperty property="*" name="employee"/>
		<jsp:useBean id="employeedao" class="com.hsbc.bean.EmployeeBeanDao"></jsp:useBean>
		<jsp:getProperty property="list" name="employeedao"/>
		
		<%
		List<EmployeeBean> list = employeedao.showAllEmployees();
		pageContext.setAttribute("list" , list);
		%>
		
		<table border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
			<th>Employee Department</th>
			<th>Action</th>
			
		</tr>
		<c:forEach items="${list}" var="con">
			<tr>
				<td>${con.id}</td>
				<td>${con.name}</td>
				<td>${con.salary}</td>
				<td>${con.department}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>






