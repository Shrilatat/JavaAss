<!DOCTYPE html>
<%@page import="com.hsbc.bean.MessageBean"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP!!</h1>


	<jsp:useBean id="u1" class="com.hsbc.bean.User"/>
	<jsp:setProperty property="*" name="u1"/>
	${u1.username}
	
	Details:
	<%
		out.println(u1);
	%>
</body>
</html>