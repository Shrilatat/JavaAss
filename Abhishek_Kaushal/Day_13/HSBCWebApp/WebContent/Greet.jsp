<!DOCTYPE html>
<html>
<head>
<title>Greet</title>
</head>
<body>

	<%
		String name = request.getParameter("name");
		java.util.Date d = new java.util.Date();
		if(d.getHours() < 12)
		{
			out.println("Good Morning "+ name);
		}
		else if(d.getHours() >= 12 && d.getHours() < 18)
		{
			out.println("Good Day "+ name);
		}
		else
		{
			out.println("Good Evening "+ name);
		}
	%>
	<!-- <h1>Welcome <%=request.getParameter("username") %></h1> -->
</body>
</html>