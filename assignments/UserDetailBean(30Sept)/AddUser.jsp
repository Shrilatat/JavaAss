<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.hsbc.bean.UserDetailDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<jsp:useBean id="uBean" class="com.hsbc.bean.UserDetailBean"></jsp:useBean>
<jsp:setProperty property="*" name="uBean"/>

<%
UserDetailDao dao=new UserDetailDao();
Boolean res=dao.addContact(uBean);
%>


</body>
</html>