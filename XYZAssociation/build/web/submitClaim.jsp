<%-- 
    Document   : loginView
    Created on : 21-Oct-2019, 14:58:11
    Author     : j3-lui
--%>

<%@page import="model.User"%>
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
        <h1>Make Claim</h1>
        <p>
        <form method="post" action="SubmitClaimController.do"><p style="text-align:center">
                <br /><label id="textid">Rationale:</label><br />
                <input id="textboxid" type="text" name="rationale">
                <br /><label id="textid">Cost (£): </label><br />
                <input id="textboxid" type="number" name="cost" min="0" step="0.01" value="0.00"><br />
                <br><input type="SUBMIT" value="Submit Claim" style="color: royalblue">
            </p></form>
    </p>
</body>

</html>
