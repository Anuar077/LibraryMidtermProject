<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 14.03.2021
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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

<header>


    <a href="library.jsp">Library</a>|
    <a href="register.jsp">Register</a>|
    <a href="bookservlet">BookList</a>|
    <a href="login.jsp">Login</a>|
    <a href="loginfilter.jsp">LoginFilter</a>|
    <a href="filterlogout">LogoutFilter</a>|
    <a href="main">MainFilter</a>
</header>
<div class="wrapper">
    <h1 class="text-center">Library Register</h1>
    <form class="text-center" action="libraryservlet" method="post">
        <input type="text" name="title" placeholder="Title"/><br/>
        <input type="text" name="author" placeholder="Author"/><br/>
        <input type="text" name="page" placeholder="Page"/><br/>
        <input type="text" name="yaer" placeholder="Year"/><br/>
        <input type="submit" name="submit" value="Submit"/>
    </form>
</div>
</body>
</html>
