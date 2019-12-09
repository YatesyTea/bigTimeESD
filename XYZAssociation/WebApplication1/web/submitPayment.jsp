<%-- 
    Document   : makePayment
    Created on : 25-Nov-2019, 13:39:34
    Author     : joshp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Make Payment</title>
        <style>
        #textid {
            text-align: center;
            font-family: Verdana;
            font-size: 14pt;
            color: white;
        }

        #textboxid {
            text-align: center;
            height: 30px;
            width: 300px;
            font-family: Verdana;
            font-size: 14pt;
            color: teal;
        }
    </style>
    
    <h1 style="text-align:center; position:fixed; top:5px; right:5px;"><a id="textid" href="/XYZAssociation/index.html">Log Out</a></h1> 
    </head>
    <body style="background-color: teal">
        <h1 id="textid">Make Payment</h1>
        
        <p>
        <form method="post" action="SubmitPaymentController.do"><p style="text-align:center">
                <br /><label id="textid">Payment Type:</label><br />
                <input id="textboxid" type="text" name="payment">
                <br /><label id="textid">Cost (£): </label><br />
                <input id="textboxid" type="number" name="cost" min="0" step="0.01" value="0.00"><br />
                <br><input type="SUBMIT" value="Submit Claim" style="color: royalblue">
            </p></form>
    </p>
        
    </body>
</html>
