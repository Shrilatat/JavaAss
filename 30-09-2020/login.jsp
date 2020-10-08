
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login.jsp">
		<label>Username</label> <br> <br>
		<input type="text" name="userName"> <br> <br>
		<label>Password</label> <br> <br>
		<input type="password" name="passWord">	<br> <br>
		<input type="submit">
	</form>
	<% 
	// Incomplete
	String userName = request.getParameter("userName");
	String passWord = request.getParameter("passWord");
	String userNameH = "kshitij";
	String passWordH = "qwe";
	if(userNameH.equals(userName) && passWordH.equals(passWord)){%>
		<jsp:forward page="/valid.jsp"/><% }
	else {%>
		<jsp:forward page="/invalid.jsp"/> <%} %>
</body>
</html>