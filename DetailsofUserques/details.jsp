<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.hsbc.DetailsDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="uuu" class="com.hsbc.DetailsBean"></jsp:useBean>
<jsp:setProperty property="*" name="uuu"/>

<%
DetailsDao dao=new DetailsDao();
Boolean res=dao.addDetails(uuu);
%>
</body>
</html>