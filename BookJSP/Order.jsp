<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Book</title>
</head>
<body>
<%@ page import="com.hsbc.dao.BookDao, java.util.*, com.hsbc.*" %>
<%
	String lang = request.getParameter("lang");
	BookDao dao = new BookDao();
	List<Book> books = dao.display(lang);
	
%>
	<table border=1 width=50% height=50">
	<tr><th>Lang</th><th>Title</th><th>Price</th><tr>
<%
	for (Book book : books) {
		out.println("<tr><td>" + book.getLang() + "</td><td>" + book.getTitle() + "</td><td>" + book.getPrice());
	} %>
	</table> 

</body>
</html>