
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.hsbc.Dao.EmployeeDao,java.util.*,com.hsbc.bean.Employee" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Manager</title>
</head>
<body>



<%
	EmployeeDao dao = new EmployeeDao();
	List<Employee> employees = dao.display();
	request.setAttribute("employees", employees);
%>

<table border=1>
	<tr><th>ID</th><th>Name</th><th>Salary</th><th>Department</th>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.sal}</td>
            <td>${employee.department}</td>
             <td><a href="Delete.jsp?id=${employee.getId()}">Delete</a></td><td>
        </tr>
    </c:forEach>
	</table>
</body>
</html>