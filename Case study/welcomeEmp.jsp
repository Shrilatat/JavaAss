<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List,com.hsbc.emp.EmpBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h2>Employee Information</h2>
	<%
		String empname = (String) request.getAttribute("empname");
	List<EmpBean> elist=(List<EmpBean>)request.getAttribute("emplist");
	%>
	<h3> WELCOME <%=empname%> </h3>

	<a href="addRecord.jsp" >Add new Employee</a><br>

   	<a href="dispEmp.jsp" >Retrieve all records</a>
</body>
</html>