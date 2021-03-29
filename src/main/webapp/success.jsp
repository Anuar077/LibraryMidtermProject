<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 30.03.2021
  Time: 0:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String data=(String)session.getAttribute("session-uid");
    out.println("Welcome "+ data+"!!");
%>
</body>
</html>
