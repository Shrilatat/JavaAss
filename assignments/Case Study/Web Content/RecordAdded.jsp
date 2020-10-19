<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.hsbc.employee.EmpDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<jsp:useBean id="eBean" class="com.hsbc.employee.EmployeeBean"></jsp:useBean>

	<jsp:setProperty property="*" name="eBean" />

	<%
		EmpDao dao = new EmpDao();
		    Boolean res = dao.addEmployee(eBean);
		    if(res)
            out.print("EMPLOYEE ADDED!!!");

	%>




</body>
</html>