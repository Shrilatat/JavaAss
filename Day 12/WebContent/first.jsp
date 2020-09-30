<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgrey">

<h1>Welcome to JSP in main jsp page !!!</h1>

<c:out value="Hello! Welcome."/><br>
<!-- <c:out value="${1+2+3+4+5}"/> -->


<c:forEach var="i" begin="2" end="20" step="2">
	${i}<br>
	</c:forEach>


</body>
</html>