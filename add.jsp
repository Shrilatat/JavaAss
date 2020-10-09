<%@ page import="java.util.*,java.sql.*,com.trg.project.EmployeeAuthenticationDao" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>My Credentials</title>
</head>
<body>
<h4>Contact Manager</h4>
   <form method="post" action="add2.jsp"> 
	  Enter Id: <input type="text"   name="empId"><br><br>
	  Enter Name: <input type="text"   name="empName"><br><br>
	  Enter Salary:     <input type="text"  name="empSal"><br><br>
	  Enter Department: <input type="text"  name="empDept"><br><br>
	<input type="submit" name="Add">
</form> 
</body>
</html>