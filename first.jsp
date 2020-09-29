<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to JSP!!</h1>
<!--  html comment --> 


<%
int no1 = Integer.parseInt(request.getParameter("n1"));
int no2 = Integer.parseInt(request.getParameter("n2"));
int no3 = no1+no2;
out.println("The sumis : " +no3);
%>



<%--jsp comment --%>

</body>
</html>
