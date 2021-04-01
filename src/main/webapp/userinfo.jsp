<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 30.03.2021
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>

<%@ page import = " java.util.* " %>
<html>
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

<h1>Request Implicit</h1>
<%
    String username=request.getParameter("uname");
    String password=request.getParameter("pass");
   out.print("Name: "+username+" Password: "+password);
%>
</body>
</html>
