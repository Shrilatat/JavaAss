
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>


<h1>Welcome to jsp <%= request.getParameter("uname") %></h1>

<%
java.util.Date d = new java.util.Date();
out.println(d);


%>

</body>
</html>