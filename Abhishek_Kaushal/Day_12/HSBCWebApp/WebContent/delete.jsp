<!DOCTYPE html>
<%@ taglib  prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hsbc.bean.ContactBean , com.hsbc.bean.ContactBeanDao"%>
<%@page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dao" class="com.hsbc.bean.ContactBeanDao"></jsp:useBean>
	<jsp:getProperty property="list" name="dao"/>
	
	<%
		List<ContactBean> list = dao.getList();
		list.remove(request.getAttribute("contact"));
	%>
	<jsp:forward page="ContactManager.jsp"></jsp:forward>
</body>
</html>