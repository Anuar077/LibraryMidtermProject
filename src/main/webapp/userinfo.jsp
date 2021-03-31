<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 30.03.2021
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page import = " java.util.* " %>
<html>
<body>
<h1>Request Implicit</h1>
<%
    String username=request.getParameter("uname");
    String password=request.getParameter("pass");
   out.print("Name: "+username+" Password: "+password);
%>
</body>
</html>
