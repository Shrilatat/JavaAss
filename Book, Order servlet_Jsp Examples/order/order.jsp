<%@page import="com.hsbc.servletdemo.book.Book"%>
<%@page import="com.hsbc.servletdemo.order.OrderDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <% 
	String str=request.getParameter("name"); 
	OrderDao dao=new OrderDao();
	Book b=dao.getBook(str);
%>
<table border=1 width=30% height=20%>
<tr><th>Book Name</th><th>Author</th><th>Category</th><th>Price</th></tr>
<tr><td><%=b.getBname()%></td>
<td><%=b.getAuthor()%></td>
<td><%=b.getCat()%></td>
<td><%=b.getPrice()%></td></tr>
</table>



</body>
</html>