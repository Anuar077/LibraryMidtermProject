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
    <title>Action UseBean</title>
</head>
<body>
<jsp:useBean id="obj" class="actions.ActionCalculator"/>
<h1>Action Tags UseBean</h1>
<%
    int m=obj.multiplication(5);
    out.print("multiplication of 5 is "+m);
%>
</body>
</html>
