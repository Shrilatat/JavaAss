<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%

java.util.Date d = new java.util.Date();
out.println(d);

if(d.getHours() < 12)
{
	
	out.print("Good morning");
}
if(d.getHours()> 12  && d.getHours()<18 )
{
	
	out.print("Good afternoon");
}
else
{
	
	out.print("Good evening");
}


%>

</body>
</html>