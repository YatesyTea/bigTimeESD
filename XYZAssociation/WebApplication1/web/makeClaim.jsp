<%-- 
    Document   : makeClaim
    Created on : 24-Nov-2019, 13:39:51
    Author     : joshp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Make Claim Tab</title>
    </head>
    <body>
        <form> 
            Rationale:<br>
            <input type="text" id="rationale_id" style="align-self:center"><br>
            Cost:<br>
            <input type="text" id="cost_id" style="align-self:center"><br>
        </form>
        <form method="post" action="MakeClaimController.do"><p style="text-align:center">
        <input id="textboxid" type="SUBMIT" value="Make Claim" style="align-self: center">
        </p></form>
    </body>
</html>
