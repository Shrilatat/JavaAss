<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.hsbc.assignments1.Book"%> 
<%@page import="java.util.ArrayList"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><h1>Your Book Details =></h1></title>
</head>
<body bgcolor="lightgrey">

<h1>Displaying Book List</h1> 
<hr>
      <table border ="1"> 
         <tr> 
          <th><b>Language Name</b></th> 
          <th><b>Book Name</b></th> 
          <th><b>Book ID</b></th> 
         </tr> 
  
        <%ArrayList<Book> books =(ArrayList<Book>)request.getAttribute("data"); 
        for(Book book : books){%> 
            <tr> 
                <td><%=book.getLanguage()%></td> 
                <td><%=book.getTitle()%></td> 
                <td><%=book.getBookid()%></td> 
            </tr> 
            <%}%> 
        </table>  
       <hr>

</body>
</html>