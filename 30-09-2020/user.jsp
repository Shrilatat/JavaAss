<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User JSP</title>
</head>
<body>
	<h1>Welcome to User JSP</h1>
	<jsp:useBean id = "u1" class="com.trg.bean.UserBean" />
	<jsp:setProperty property="*" name="u1"/>
	
	The Username is : <jsp:getProperty property="username" name="u1"/> <br>
	The Age is : <jsp:getProperty property="age" name="u1"/> <br> <br>
	<%= u1%>
</body>
</html>