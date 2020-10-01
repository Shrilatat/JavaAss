<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP!!</h1>
	<%
		java.util.Date d =new java.util.Date();
	    out.println(d);
	%><br><br>
	
	<%
		int n1 = Integer.parseInt(request.getParameter("number1"));
		int n2 = Integer.parseInt(request.getParameter("number2"));
		
		m1();
		out.println("Sum is "+(n1+n2)+" and i is "+i);
	%>
	
	<%!
		int i=0;
	%>
	<%!
		public void m1(){
		i++;
	}
	%>
	<!-- <h1>Welcome <%=request.getParameter("username") %></h1> -->
</body>
</html>