<!DOCTYPE html>
<%@page import="java.sql.Connection"%>
<html>
<head>
<title>Order</title>
</head>
<body>
	<%@ page import="com.hsbc.db.DBConnection , java.sql.* , java.util.*"%>
	<%
		DBConnection connection = new DBConnection();
	Connection conn = connection.getConnection();
	PreparedStatement pstmt = conn.prepareStatement("select * from books where bookName=?");
	String str = request.getParameter("bookname");
	pstmt.setString(1, str);
	ResultSet rs = pstmt.executeQuery();
	%>
	<table border="1">
		<tr>
			<th>Book Name</th>
			<th>Book Category</th>
			<th>Book Publisher</th>
		</tr>
		<%
			while (rs.next()) { %>
				<tr>
				<td><%= rs.getString(1) %></td>
				<td><%= rs.getString(2) %></td>
				<td><%= rs.getString(3) %></td>
				</tr>
		<% }
		%>
	</table>

</body>
</html>