<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	String[][] str=(String[][])request.getAttribute("allemplist");
	int rowlen=str.length;
	int collen=str[0].length;
	System.out.println("Rows="+rowlen);
	System.out.println("Col="+collen);
	
%>
<table border=1 cellspacing=0 cellpadding=0>
<tr>
	<td>ID</td>
	<td>NAME</td>
	<td>SALARY</td>
	<td>DEPARTMENT</td>
</tr>
<%
	for(int i=0;i<rowlen;i++)
	{
%>	<tr>
<% 	
	for(int j=0;j<collen;j++)
		{
		%><td><%=str[i][j]%></td>
		<%} %> 
	</tr>
	<%}%>
</table>
</body>
</html>