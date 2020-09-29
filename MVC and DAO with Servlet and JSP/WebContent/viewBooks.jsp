<%@page import="java.util.Iterator"%>
<%@page import="com.webdemo.models.Book"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Our Library</title>
</head>
<body>
<%! ArrayList<Book> booksByAuthor,booksBySubject; %>


<% 
	booksByAuthor = (ArrayList<Book>)request.getAttribute("booksByAuthor");
	booksBySubject = (ArrayList<Book>)request.getAttribute("booksBySubject");
	Iterator itr = booksBySubject.iterator();
	Iterator itr2 = booksByAuthor.iterator();

%>
<a href="index.html"><h3>Got Back To Home Page</h3></a>
<a href="accessBooks.html"><h3>Got Back</h3></a><br>


<h3>Books Based On Subject : <%=request.getParameter("subject") %></h3>
<table border=1>
	<tr>
	<th>Name</th>
	<th>Author</th>
	<th>Price</th>
	</tr><% 
			while(itr.hasNext()){
			Book book = (Book)itr.next();%>
			<tr>
				<td><%= book.getBookname()%></td>
				<td><%=book.getAuthor()%></td>
				<td><%=book.getPrice()%></td>
			</tr>
		<% }%>
</table>



<h3>Books Based On Author : <%=request.getParameter("author") %></h3>
<table border=1>
	<tr>
	<th>Name</th>
	<th>Subject</th>
	<th>Price</th>
	</tr><% 
			while(itr2.hasNext()){
			Book book = (Book)itr2.next();%>
			<tr>
				<td><%= book.getBookname()%></td>
				<td><%=book.getSubject()%></td>
				<td><%=book.getPrice()%></td>
			</tr>
		<% }%>
</table>


</body>
</html>