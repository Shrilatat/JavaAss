<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import = "com.hsbc.database.OrderDao" import = "com.hsbc.database.Order"%>


<%
	int num = (int)request.getAttribute("ono");
	OrderDao odao = new OrderDao();
	Order o = odao.getOrder(num);	
%>

<table border=1 >
	<tr> <th>Order num </th> <th>Item name</th>  <th> Price</th>  </tr>
	<tr> <td><%= o.getOnumber() %>  </td> <td><%= o.getOname() %>  </td> <td> <%= o.getOPrice() %></td> </tr>
</table>

</body>
</html>