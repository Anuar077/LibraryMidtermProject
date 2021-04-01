<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 30.03.2021
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Application Implicit</title>
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
    <a href="scriplet.jsp">Scriplets</a>|
    <a href="request.jsp">Request Implicit</a>|
    <a href="application.jsp">Application Implicit </a>|
    <a href="response.html">Response Implicit</a>|
    <a href="paged.jsp">Page Directives</a>|
    <a href="included.jsp">Include Directives</a>|
    <a href="taglibd.jsp">Taglib Directives</a>|
    <a href="usebean.jsp">UseBean Action</a>|
    <a href="includea.jsp">Include Action</a>|
    <a href="action.html">Action</a>|
</header>
<body>

<h1>Application Implicit</h1>
<%
    Integer total= (Integer)application.getAttribute("visit");
    if( total ==null || total == 0 ){
        total = 1;
    }else{
        total = total+ 1;
    }
    application.setAttribute("visit", total);
%>
<h3>Update to the see total number of visit: <%= total%></h3>
</body>
</html>
