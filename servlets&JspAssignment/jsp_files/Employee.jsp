<!--@author Fareeya Khan
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//HttpSession sess = request.getSession();

String ss[]=request.getParameterValues("strarr");

%>
<table>
	<tr>
		<td>EmployeeID</td>
		<td>EmployeeName</td>
		<td>EmployeeSalary</td>
	</tr>
	<tr>
		<td><%=ss[0]%></td>
		<td><%=ss[1]%></td>
		<td><%=ss[2]%></td>
	</tr>
	
	
</table>
</body>
</html>