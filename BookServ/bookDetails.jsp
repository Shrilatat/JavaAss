
<!DOCTYPE html>
<html>
<head>
<title>Book Finder</title>
</head>
<body>
	<h1>Welcome to Book Finder </h1>
	<%@ page import="com.hsbc.model.Book" %>  
	<% 
		Book temp = (Book) request.getAttribute("Book");
		out.print("<tr><td>"+temp.getBookId()+"</td><td>"+temp.getBookName()+"</td>"+"<td>"+temp.getAuthor()+"</td><td>"+temp.getPrice()+"</td></tr>");
	%>
</body>
</html>