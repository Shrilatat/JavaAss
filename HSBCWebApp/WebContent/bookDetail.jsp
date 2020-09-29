<%@page import="com.hsbc.model.Book"%>
<%@page import="com.hsbc.dao.BookDatabaseDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>Book Deatils</b>
	<br>
	<hr>
	<br>
	<%
		BookDatabaseDao dao = new BookDatabaseDao();
		Book book = dao.getBookDetails((String)request.getParameter("bookname"));
		
		out.write("<br>Name: "+ book.getBookName());
		out.write("<br>Author: "+ book.getAuthor());
		out.write("<br>Price: "+ book.getPrice());
		
	%>

</body>
</html>