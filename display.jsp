<%@ page import="java.util.*,java.sql.*,com.trg.DBConnection" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>My Credentials</title>
</head>
<body>
<%

Connection conn = null;
Statement statement = null;
ResultSet resultSet = null;
conn= DBConnection.getConnection();
%>
<h2 align="center"><font><strong>Retrieve data from database in jsp</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>ID</b></td>
<td><b>NAME</b></td>
<td><b>SALARY</b></td>
<td><b>DEPARTMENT</b></td>

</tr>
<%
try{ 
statement=conn.createStatement();
String sql ="select * from detail";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("empid") %></td>
<td><%=resultSet.getString("empname") %></td>
<td><%=resultSet.getString("empsal") %></td>
<td><%=resultSet.getString("empdept") %></td>
</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>