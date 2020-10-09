<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to user JSP </h1>
<%
int age = Integer.parseInt(request.getParameter("age"));
%>

<jsp:useBean id = "u" class= "com.hsbc.bean.User" />
<jsp:setProperty property="username" name="u" value = '<%= request.getParameter("uname") %>' />
<jsp:setProperty property="age" name="u" value = "<%=age %>" />
<jsp:setProperty property="mail" name="u" value ='<%= request.getParameter("mail") %>' />

${u.username}

Details : 
<%
out.println(u);
%>

</body>
</html>