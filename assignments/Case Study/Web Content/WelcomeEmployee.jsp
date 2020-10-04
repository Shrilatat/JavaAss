<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List,com.hsbc.employee.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Info System</h1>

	<%
		String empname = (String) request.getAttribute("ename");
	List<EmployeeBean> elist=(List<EmployeeBean>)request.getAttribute("elist");
	%>

	<h3>   WELCOME 	<%=empname%> </h3>

	<a href="Addemp.jsp" style="color: purple">Add new Employee</a><br>
   
   	<a href="Showemp.jsp" style="color: purple">Retrieve all Employee
		records</a>



</body>
</html>

