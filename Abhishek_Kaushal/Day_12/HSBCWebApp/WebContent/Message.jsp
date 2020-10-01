<!DOCTYPE html>
<%@page import="com.hsbc.bean.MessageBean"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP!!</h1>
	
	
	<jsp:useBean id="mb" class= "com.hsbc.bean.MessageBean"></jsp:useBean>
	<jsp:setProperty property="msg" name="mb" value="Hello World"/>
	The message is: <jsp:getProperty property="msg" name="mb"/>
</body>
</html>