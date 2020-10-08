<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form method="post" action="ValidateLogin.jsp">
		Username: <input type="text" name="username"><br>
		<% session.setAttribute("username", request.getParameter("username")); %>
		Password: <input type="text" name="password"><br>
		<br> <input type="submit" value="Login">
	</form>
</body>
</html>