<!DOCTYPE html>
<%@page import="com.trg.dao.bookDao"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
bookDao dao = new bookDao();
%>
 
 <table border = "1">
 <tr><td>BookID</td><td>BookName</td></tr>
 <tr><td><%=Integer.parseInt(request.getParameter("bookid"))%></td><td><%=dao.getBook(Integer.parseInt(request.getParameter("bookid")))%></td></tr>
 
  

</body>
</html>