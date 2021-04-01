<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 31.03.2021
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Include Action</title>
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
</head>
<body>
<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>

</body>
</html>
