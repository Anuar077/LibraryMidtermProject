<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 30.03.2021
  Time: 0:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String data2=(String)session.getAttribute("session-uid");
    out.println("Hi "+ data2+". Id/Password are wrong. Please try Again.");
%>
</body>
</html>
