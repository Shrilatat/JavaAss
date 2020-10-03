<!DOCTYPE html>
<%@page import="com.hsbc.UserDao"%>
<%@page import="java.util.Date"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome to jsp </h1>

	<jsp:useBean id="u1" class="com.hsbc.bean.User" />
	<jsp:setProperty property="*" name="u1" />

	<jsp:getProperty property="username" name="u1"/>
	
	${u1.username }
	${u1.age }
	


</body>
</html>