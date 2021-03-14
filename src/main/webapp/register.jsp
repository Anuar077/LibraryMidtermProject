<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <!-- CSS -->
    <style>
        <%@ include file="/main.css" %>
    </style>

</head>
<a href="library.jsp">Library</a>|
<a href="register.jsp">Register</a>|
<a href="bookservlet">BookList</a>|
<a href="login.jsp">Login</a>|
<a href="loginfilter.jsp">LoginFilter</a>|
<a href="filterlogout">LogoutFilter</a>|
<a href="main">MainFilter</a>
<body>
<div class="wrapper">
    <h1 class="text-center">Register</h1>
    <form class="text-center" action="register" method="post">
        <input type="text" name="login" placeholder="Login"/><br/>
        <input type="password" name="password" placeholder="Password"/><br/>
        <input type="text" name="email" placeholder="First Name"/><br/>
        <input type="text" name="address" placeholder="Last Name"/><br/>
        <input type="submit" name="submit" value="Submit"/>
    </form>
</div>
</body>