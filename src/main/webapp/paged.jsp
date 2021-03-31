<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 30.03.2021
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page Directives</title>
</head>
<body>
<%-- JSP code to demonstrate how to use page
directive to import a package --%>
<h1>Page Directives</h1>
<%@page import = "java.util.Date"%>
<%Date d = new Date();%>
<%=d%>

</body>
</html>
