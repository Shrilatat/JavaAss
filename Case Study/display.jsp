<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.trg.dao.EmpDao"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>record of all the employees</h1>
<% EmpDao dao = new EmpDao();
   ResultSet rs = dao.getEmployees();
%>
<table border=1 align=center style="text-align:center">
      <thead>
          <tr>
             <th>ID</th>
             <th>NAME</th>
             <th>SALARY</th>
             <th>DEPARTMENT</th>
          </tr>
      </thead>
      <tbody>
        <%while(rs.next())
        {
            %>
            <tr>
                <td><%=rs.getInt("id") %></td>
                <td><%=rs.getString("name") %></td>
                <td><%=rs.getInt("salary") %></td>
                <td><%=rs.getString("department") %></td>
            </tr>
            <%}%>
           </tbody>
        </table><br>
</body>
</html>