<%-- 
    Document   : memberInfo
    Created on : 25-Nov-2019, 13:17:19
    Author     : joshp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Claim"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: teal">
        <h1>Claims and Payments</h1>

        <%
            User user = (User) session.getAttribute("status");
            out.println("You are logged in as: " + user.getName());
            //ArrayList<Claim> claim = (ArrayList<Claim>) request.getAttribute("claimsList");
            ArrayList<Claim> claimList = (ArrayList<Claim>)request.getAttribute("claimsList");
            for (int i = 0; i < claimList.size(); i++) {
                out.println(claimList.get(i).display());
            }
        %>

    </body>
</html>
