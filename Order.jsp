<%@ page language="java" import="java.util.*,java.sql.*,com.trg.DBDemoDao2" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>My Credentials</title>
</head>
<body><h4>The password for the entered username is:</h4>


 <% 
     String num1=request.getParameter("username");
     DBDemoDao2 obj=new DBDemoDao2();
	 String value = obj.Validation(num1);
     %>
     <table border=5>
     <tr><th>Username</th><th>Password</th></tr>
     <tr><td><%=num1%></td><td><%=value%></td></tr>
     </table>
</body>
</html>