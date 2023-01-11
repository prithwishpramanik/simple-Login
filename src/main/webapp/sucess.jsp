<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.login.simplelogin.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucess</title>
</head>
<body>

<h1>Login done.....</h1>
<%
User user=(User)session.getAttribute("user");
%>

Hello <%=user.getUserName() %>!
</body>
</html>