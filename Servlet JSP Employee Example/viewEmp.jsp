<%@page import="java.util.List"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.hsbc.servletdemo.empEx.EmpDao"%>
<%@page import="com.hsbc.servletdemo.empEx.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
</head>
<body>
<%
	EmpDao dao=new EmpDao();
%>

<%String val=request.getHeader("Referer");
	if(val.contains("viewEmp.jsp"))
	{
	dao.deletEmp(request.getParameter("value"));
	}
	List<Employee> list=dao.getAllEmp();
	pageContext.setAttribute("list",list);
%><br>
	<table border=1 width=50% height=20%>
	<tr>
		<th>Employee id</th>
		<th>Employee Name</th>
		<th>Employee Salary</th>
		<th>Employee dept</th>
		<th>remove</th>
	</tr> 
	
	<c:forEach items="${list}" var="emp">
	<tr><td>${emp.eid }</td>
	<td>${emp.ename}</td>
	<td>${emp.sal}</td>
	<td>${emp.dept}</td>
	<td><a href="viewEmp.jsp?value=${emp.eid}"> delete</a></td>
	</tr> 
	</c:forEach>
	</table>
	
</body>
</html>