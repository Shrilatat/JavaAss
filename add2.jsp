<%@ page import="java.util.*,java.sql.*,com.trg.project.EmployeeAuthenticationDao" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>My Credentials</title>
</head>
<body>
<%
String s1=(String)request.getParameter("empId");
int id=Integer.parseInt(s1);
String name=(String)request.getParameter("empName");
String s2=(String)request.getParameter("empSal");
int sal=Integer.parseInt(s2);
String dept=(String)request.getParameter("empDept");
EmployeeAuthenticationDao o1=new EmployeeAuthenticationDao();
o1.addEmp(id,name,sal,dept);
%>
</body>
</html>