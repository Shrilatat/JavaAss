<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Manager</title>
</head>
<body>

<%@ page import="com.hsbc.dao.EmployeeDao,java.util.*,com.hsbc.bean.Employee" %>

<%
	EmployeeDao dao = new EmployeeDao();
	List<Employee> employees = dao.display();
	request.setAttribute("employees", employees);
%>

<table border=1>
	<tr><th>ID</th><th>Name</th><th>Salary</th><tr><th>Department</th></tr>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.sal}</td>
            <td>${employee.dept}</td>
            <td><a href="deleteEmp.jsp?id=${employee.getId()}">Delete</a>
        </tr>
    </c:forEach>
	</table>
</body>
</html>