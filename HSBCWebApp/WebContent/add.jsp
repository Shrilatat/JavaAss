<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add using jsp]</title>
</head>
<body>
	The sum is 
	<%= Integer.parseInt(request.getParameter("a")) + Integer.parseInt(request.getParameter("b")) %>
</body>
</html>