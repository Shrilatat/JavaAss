<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
		String name = (String)request.getParameter("name");
		String pass = (String)request.getParameter("password");
		
		if(name.equals("admin") && pass.equals("admin123")){%>
			<jsp:forward page="valid.jsp"/>
	 	<% }else {%> 
			<jsp:forward page="invalid.jsp"/>
			<%} %>
</body>
</html>