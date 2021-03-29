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
    <title>Application</title>
</head>
<body>
<%

    Integer counter= (Integer)application.getAttribute("numberOfVisits");
    if( counter ==null || counter == 0 ){

        counter = 1;
    }else{

        counter = counter+ 1;
    }
    application.setAttribute("numberOfVisits", counter);
%>
</body>
</html>
