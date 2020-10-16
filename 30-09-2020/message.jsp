<%@page import = "com.trg.bean.MessageBean" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <jsp:useBean id="mb" class="com.trg.bean.MessageBean"/>
 <jsp:setProperty property="msg" name="mb" value="Hello World"/>
 The message is : <jsp:getProperty property="msg" name="mb"/>
 
 <%
 	// MessageBean mb = new MessageBean();
 	// mb.setMsg("Hello World");
 	// out.println(mb.getMsg());
 %>
 
</body>
</html>