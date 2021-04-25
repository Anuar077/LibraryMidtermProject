<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Secured Page</title>
</head>
<body>
<% if ( request.getAttribute( "successMessage" ) != null ) { %>
<span style="background-color: lightgreen"><%=request.getAttribute( "successMessage" )%></span>
<% } %>
<h2>Servlet Security Example</h2>
<div> Servlet Basic Authentication Annotation Configuration : <span>Secured Servlet</span></div>
<div>
    <ul>
        <li>User Name Is : <span><%=request.getUserPrincipal().getName()%> </span></li>
        <li>Authentication Type Is : <span><%=request.getAuthType()%></span></li>
    </ul>
</div>
</body>
</html>
