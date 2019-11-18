<%-- 
    Document   : loginView
    Created on : 21-Oct-2019, 14:58:11
    Author     : j3-lui
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Result</title>
    </head>
    <body>
        <h1>Login Result</h1>
        <p>
            <%
                String verified = (String) request.getAttribute("verify");
                out.print("Login: " + verified);
            %>
    <html><body>
            <!--<a href=checkcookie.do>click here</a>-->
        </body></html>
</body>

</html>
