<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>

        body {
            background-color: coral;
            text-align: center;
        }
        header{
            background-color: OldLace;
            text-align: center;
        }
    </style>
</head>
<header>
    <a href="library.jsp">Library</a>|
    <a href="register.jsp">Register</a>|
    <a href="bookservlet">BookList</a>|
    <a href="loginfilter.jsp">LoginFilter</a>|
    <a href="login.jsp">Login</a>|
    <a href="filterlogout">LogoutFilter</a>|
    <a href="main">MainFilter</a>
</header>
<body>
<div class="lib">
    <h1 class="text-center">Login</h1>
    <form class="text-center" action="login" method="post">
        <input type="text" name="login" placeholder="Login"/><br/>
        <input type="password" name="password" placeholder="Password"/><br/>
        <input type="submit" name="submit" value="Submit"/>
    </form>
</div>
</body>
