<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List,com.hsbc.emp.EmpDao,java.util.List,com.hsbc.emp.EmpBean,com.hsbc.emp.EmploginServlet"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp details</title>
</head>
<body>
<%
EmpDao dao = new EmpDao();
List<EmpBean> elist=dao.selectEmp();
pageContext.setAttribute("emp",emplist);
%>
	<table border="2">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>DEPARTMENT</th>
			<th>REMOVE</th>
		</tr>


<c:forEach var="emp" items="${emp}">
             <tr>
		<td>${emp.empId}</td>
		<td>${emp.empName}</td>
		<td>${emp.empSal}</td>
		<td>${emp.empDept}</td>

  <td><a href="Emplogin?action=DELETE&id=${emp.empId}">DELETE </a></td>
	</tr>
	</c:forEach>
	</table>

</body>
</html>