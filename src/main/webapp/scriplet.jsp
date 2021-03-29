<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 29.03.2021
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scriptlet</title>
</head>
<body>
<h1>JSP Scriptlet Tags</h1>
<%-- Comment scriplet --%>
<h1>Partial statement:</h1>
<%
    double num = 100.0;
    num = num - 15.0;
%>
<%-- Second comment scriplet--%>
<p>Expression: <%= num  %></p>

<h1>Declaration:</h1>

<%! int num2 = 8; %>
<% if (num2 >= 9) {%>
<p>Expression: <%= num2  %></p>
<% } else {%>
<p>Not more 9: <%= num2  %></p>
<%} %>
</body>
</html>
