
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		java.util.Date d = new java.util.Date();
		System.out.println(d.getHours());
		if (d.getHours()<12){
			out.print("<h2> Good Morning <h2>");
		}
		else if (d.getHours()>12 && d.getHours()<18){
			out.print("<h2> Good Afternoon <h2>");
		}
		else{
			out.print("<h2> Good Evening <h2>");
		}
	%>
</body>
</html>