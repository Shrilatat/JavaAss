
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Orders</title>
</head>
<body>
 	<%@ page import = "java.util.ArrayList" %>
 	<%@ page import = "database.bookOrderJSP" %>
	<%	
		String bookName = request.getParameter("bookName");
		ArrayList<String> ans = bookOrderJSP.returnBook(bookName);
	%>
	<form action="bookOrder.jsp">
		<label>Enter Name of Author </label> <br> <br>
		<input type="text" name="bookName"> <br> <br>
		<input type="submit"> <br> <br>
	</form>
	<h3> Book Names <h3> <br> <br>
	<p>
	<%for(String s : ans){
		out.println("<h3>"+s+"</h3>");
	} %>
	</p>
	
</body>
</html>