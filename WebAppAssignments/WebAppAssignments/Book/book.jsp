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
  out.println("Book ID:" + Integer.parseInt(request.getParameter("bookid")));
  out.println(dao.getBook(Integer.parseInt(request.getParameter("bookid"))));

%>

</body>
</html>