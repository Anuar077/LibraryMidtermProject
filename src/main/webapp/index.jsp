<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
        div{
            background-color:grey;
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
    <a href="scriplet.jsp">Scriplet</a>|
    <a href="request.jsp">Request</a>|
    <a href="application.jsp">Application </a>|
    <a href="response.html">Response</a>|
    <a href="paged.jsp">Page Directives</a>|
    <a href="included.jsp">Include Directives</a>|
    <a href="taglibd.jsp">Taglib Directives</a>|
    <a href="usebean.jsp">Usebean</a>|
    <a href="includea.jsp">Icnlude</a>|
    <a href="action.html">Action</a>|
</header>
<body>
<h1><%= "Hello on the Web application!" %>
</h1>
<br/>
</body>
</html>