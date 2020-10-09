<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List,com.hsbc.mvc.EmpBean"%>
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
	List<EmpBean> elist=(List<EmpBean>)request.getAttribute("elist");
	%>

	<h3>   WELCOME 	<%=empname%> </h3>

	<a href="CSAddemp.jsp" style="color: purple">Add new Employee to list</a><br>

   	<a href="CSShowemp.jsp" style="color: purple">Show all employees</a>



</body>
</html>
