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

        <style>
            #textid
            {   
                text-align: center;
                font-family: Verdana;
                font-size:14pt;
                color: white;
            }

            #textboxid
            {   
                text-align: center;
                height:30px;
                width:300px;
                font-family: Verdana;
                font-size:14pt;
                color: teal;
            }
        </style>

    </head>
    <body style="background-color: teal">
        <p>
            <%
                //String verified = (String) request.getAttribute("verify");
                //out.print("Login: " + verified);
            %>

            <title id="textid">MEMBERS DASHBOARD</title>
        <h1 id="textid">Awaiting Approval:             
            <%
                Double balance = (Double) request.getAttribute("balance");
                out.print("£" + Double.toString(balance));
            %>
        </h1>
        <form method="post" action="ShowSubmitPayment.do"><p style="text-align:center">
                <input id="textboxid" type="SUBMIT" value="Make Payment" style="align-self: center">
            </p></form>
    </body>

</html>
