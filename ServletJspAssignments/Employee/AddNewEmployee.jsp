<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page import="com.hsbc.Dao.EmployeeDao,java.util.*,com.hsbc.bean.Employee" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
		<form method="POST" action="AddNewEmployee.jsp">
		Enter ID:<input type="text" name="id"><br><br>
		Enter Name:<input type="text" name="name"><br><br>
		Enter Salary:<input type="text" name="sal"><br><br>
		Enter Department:<input type="text" name="department"><br><br>
		<input type="submit" value="Add">
		
		</form>
		
	<jsp:useBean id="e" class="com.hsbc.bean.Employee"/>
	<jsp:setProperty property="*" name="e"/>
	
	<%
	if(request.getMethod().equals("POST")){
		EmployeeDao dao = new EmployeeDao();
		dao.addEmployee(e);
	}
	%>
		
		
	</body>
</html>