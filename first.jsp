<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to JSP- main page!!</h1>
<!--  html comment --> 

<c:out value="hello mauli" /> <br>

${1+2+3+4+5}
<br>
<c:out value="${param.uname}" default = "no info"/>




<%--<%
int no1 = Integer.parseInt(request.getParameter("n1"));
int no2 = Integer.parseInt(request.getParameter("n2"));
int no3 = no1+no2;
out.println("The sumis : " +no3);
--%>
<%--test2.html will be included during run time --%>



<%--jsp comment --%>

</body>
</html>
