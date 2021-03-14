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
<div class="wrapper">
    <h1 class="text-center">Login</h1>
    <form class="text-center" action="login" method="post">
        <input type="text" name="login" placeholder="Login"/><br/>
        <input type="password" name="password" placeholder="Password"/><br/>
        <input type="submit" name="submit" value="Submit"/>
    </form>
</div>
</body>
