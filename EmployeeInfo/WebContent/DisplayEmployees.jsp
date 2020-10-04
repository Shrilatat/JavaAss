
<!DOCTYPE html>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="jdk.swing.interop.SwingInterOpUtils"%>
<%@page import="com.hsbc.employeeinfo.GetEmpDetailsFromDB"%>
<%@page import="com.hsbc.employeeinfo.GetDBConnecttion"%>
<%@page import="com.hsbc.employeeinfo.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.hsbc.employeeinfo.EmployeeDao"%>
<html>
<head>
</head>
<body>
	<%
	GetEmpDetailsFromDB ged = new GetEmpDetailsFromDB();
	List<Employee> emplist = ged.getEmpDetails();
	pageContext.setAttribute("list",emplist);
	System.out.println(emplist);
	
	%>
	<table border="1">
		<tr>
			<th>Empid</th>
			<th>Empname</th>
			<th>salary</th>
			<th>dept</th>
			<th>Remove Element</th>
		</tr>
		<c:forEach items="${list}" var="l">
			<tr>
				<td id="tid">${l.id}</td>
				<td>${l.name}</td>
				<td>${l.salary}</td>
				<td>${l.dept}</td>
				<td><a href="RemoveEmployee.jsp">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>