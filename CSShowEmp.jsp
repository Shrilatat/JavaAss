<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List,com.hsbc.mvc.EmpDao,java.util.List,com.hsbc.mvc.EmpBean,com.hsbc.mvc.EmpServlet"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
EmpDao dao = new EmpDao();
List<EmpBean> elist=dao.selectEmployees();
pageContext.setAttribute("employee",elist);
%>

	<table border=5>

		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>DEPARTMENT</th>
			<th>REMOVE</th>
		</tr>


		<c:forEach var="emp" items="${employee}">

             <tr>
				<td>${emp.eId}</td>
				<td>${emp.eName}</td>
				<td>${emp.eSal}</td>
				<td>${emp.eDept}</td>

  <td><a href="Emplogin?action=DELETE&id=${emp.eId}">DELETE </a></td>
			</tr>
		</c:forEach>



	</table>

</body>
</html>