<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action= "radius.jsp">
	Radius: <input type = "number" name= "rad"><br>
	<input type = "submit" value="Submit"><br><br>
	
	<%
		double area = 0;
		if(request.getMethod().equals("POST"))
		{
			int r = Integer.parseInt(request.getParameter("rad"));
			area = Math.PI * r * r;
		}
	%>
	Area: <%= area %>
	
</form>
	
	
	
</body>
</html>