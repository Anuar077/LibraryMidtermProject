<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 30.03.2021
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="obj" class="actions.Calculator"/>

<%
    int m=obj.cube(5);
    out.print("cube of 5 is "+m);
%>
</body>
</html>
