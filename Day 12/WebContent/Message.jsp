<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.hsbc.beans.MessageBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message JSP</title>
</head>
<body>
<h1>Welcome to Message JSP</h1>

<!--  IN JAVA SCRIPTLET
	MessageBean mb1 = new MessageBean();
	mb1.setMsg("Hello World!");
	out.println(mb1.getMsg());
 -->
 
 
<jsp:useBean id="mb" class="com.hsbc.beans.MessageBean"/>
<jsp:setProperty property="msg" name="mb" value="Hello World!"/>
The message is => <jsp:getProperty property="msg" name="mb"/>
</body>
</html>