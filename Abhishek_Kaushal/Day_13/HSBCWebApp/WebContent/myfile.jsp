<!DOCTYPE html>
<%@ taglib  prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP!!</h1>
	
	<c:out value="Hello Welcome!!"></c:out>
	<c:out value="${1+2+3}"></c:out>
	
	<c:forEach items="${param}" var="v">
		${v.key}   ${v.value}  <br>
	</c:forEach>
	<br>
	<c:forEach var = "i" begin = "2" end="20" step = "2">
		<c:out value="${i}"></c:out> <br>
	 </c:forEach>
</body>
</html>