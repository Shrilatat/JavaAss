
<!DOCTYPE html>
<html>
<head>
<title>My Credentials</title>
</head>
<body><h1>Employee Info System</h1>
<%String name=(String)request.getAttribute("username");
%>
<h4>Welcome <%=name %></h4>
<a href = "add.jsp">
        Add new Employee
        </a><br>
<a href = "display.jsp">
       Retrieve All Employee records
        </a>
</body>
</html>