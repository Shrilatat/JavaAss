<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" import="com.hsbc.bean.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Contact Manager</h2>
<form method = "get" action = "ContactManager.jsp">
		
			First Name:  <input type = "text" name = "fname"> <br> <br>
			Last Name:  <input type = "text" name = "lname"> <br> <br>
			Email ID:  <input type = "email" name = "mail"> <br> <br>
			Telephone:  <input type = "test" name = "phone"> <br> <br>		
			<input type = "submit" value ="Add Contact" > <br> <br>
			
			<hr>
			<br><br>
			
			<h2> Contacts</h2>	
			<hr>
			
			<jsp:useBean id = "con" class= "com.hsbc.bean.ContactBean" />
			<jsp:setProperty property="*" name="con"  />
			<%
			ContactDao cdao = new ContactDao();
			
			List<ContactBean> cb = cdao.addContact(con);
			
			request.setAttribute("cb",cb);
			%>
			
			
			
			<table id = "t" border = '1' bgcolor = "lightblue">
			<tr> <th> Name</th>  <th> Email</th> <th> Telephone</th> <th> Delete?</th></tr>	
			
			<c:forEach var="c" items="${cb}">
			<tr> <td> ${c.fname} &nbsp ${c.lname}</td>
			  <td> ${c.mail}</td>
			  <td> ${c.phone}</td>
			  <td> <a href= "document.getElementById("t").deleteRow(c)">delete</a>
			   <br> <br> </td></tr>
			</c:forEach>
			</table>
</form>
</body>
</html>