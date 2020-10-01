<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("username","admin");
		request.setAttribute("password","admin123");
		
		
		if(request.getAttribute("username").equals("admin") && request.getAttribute("password").equals("admin1234")){%>
			<jsp:forward page = "valid.jsp"/>
		
		<% 	
		}
		else{ %>
			<jsp:forward page = "invalid.jsp"/>
		
		<%} %>
	
</body>
</html>