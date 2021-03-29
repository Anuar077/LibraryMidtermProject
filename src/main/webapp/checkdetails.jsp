<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 30.03.2021
  Time: 0:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Check</title>
</head>
<body>
<%
String uid=request.getParameter("id");
String password=request.getParameter("pass");
session.setAttribute("session-uid", uid);
if(uid.equals("Chaitanya") && password.equals("BeginnersBook"))
{
response.sendRedirect("success.jsp");
}
else
{
response.sendRedirect("failed.jsp");
}
%>
</body>
</html>
