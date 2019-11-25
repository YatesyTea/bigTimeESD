<%-- 
    Document   : memberInfo
    Created on : 25-Nov-2019, 13:17:19
    Author     : joshp
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: teal">
        <h1>Member Info</h1>
        
        <%          
                User user = (User)session.getAttribute("status");
                out.println(user.getName());
            %>
            
    </body>
</html>
