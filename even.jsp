<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="i" begin ="2" end = "20" step="2" >
${i} <br>
</c:forEach>
<hr>
<c:forEach var="i" items = "1,4,7,9,10">
item : ${i} <br>
</c:forEach>
<hr>



</body>
</html>