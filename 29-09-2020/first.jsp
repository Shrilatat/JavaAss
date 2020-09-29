<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1> Welcome to JSP</h1>
	<%
		java.util.Date d = new java.util.Date();
		out.println(d);
	%>
	
	<h1>Welcome <%= request.getParameter("uname") %>></h1>
</body>
</html>