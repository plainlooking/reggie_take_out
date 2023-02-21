<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<h1>登陆</h1>
<form action="${pageContext.request.contextPath}/servlet/Login" method="post">
    <input type="text" name="username">
    <input type="submit">
</form>
</body>
</html>
