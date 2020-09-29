<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.hsbc.webapp.BookFindDao" import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MY BOOK</title>
</head>
<body>
<%

BookFindDao dao=new BookFindDao();
int id=Integer.parseInt(request.getParameter("bid"));
ResultSet rs=dao.getBooks(id);

int bid=rs.getInt(1);
String name=rs.getString(2);
String category=rs.getString(3);
int price=rs.getInt(4);

%>
<table border=5>
<tr><th>BOOK ID</th> <th>BOOK NAME</th> <th>BOOK CATEGORY</th> <th>BOOK PRICE</th></tr>
<tr> <td><%=bid %></td>
<td> <%=name%></td>
<td><%=category %> </td>
<td> <%=price %></td>

</tr>
</table>
</body>
</html>