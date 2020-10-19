<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
	<table>
	<%
		String str = (String)application.getAttribute("orderName");
		out.println(str);
	%>
	<tr><td>str<tr><td>
</body>
</html>