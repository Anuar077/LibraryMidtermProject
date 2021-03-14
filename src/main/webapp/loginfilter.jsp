<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <!-- CSS -->
    <style>
        <%@ include file="/main.css" %>
    </style>

</head>
<body>
<a href="library.jsp">Library</a>|
<a href="register.jsp">Register</a>|
<a href="bookservlet">BookList</a>|
<a href="login.jsp">Login</a>|
<a href="loginfilter.jsp">LoginFilter</a>|
<a href="filterlogout">LogoutFilter</a>|
<a href="main">MainFilter</a>
<form action="filterlogin" method="post">
    Name:<input type="text" name="name"><br>
    Password:<input type="password" name="password"><br>
    <input type="submit" value="filterlogin">
</form>
</body>
</html>