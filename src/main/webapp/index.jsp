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
<a href="main">MainFilter</a>|
    <br>
    <a href="scriplet.jsp">Scriplets</a>|
    <a href="request.jsp">Request Implicit</a>|
    <a href="application.jsp">Application Implicit </a>|
    <a href="response.html">Response Implicit</a>|
    <a href="paged.jsp">Page Directives</a>|
    <a href="included.jsp">Include Directives</a>|
    <a href="usebean.jsp">UseBean Action</a>|
    <a href="includea.jsp">Include Action</a>|
    <a href="action.html">Action</a>|

    <br>
   <a href="addPost.jsp">Write Post</a>|
    <a href="error.jsp">Error</a>|
</header>
<body>
<h1><%= "Hello on the Web application!" %>
</h1>
<br/>
</body>
</html>