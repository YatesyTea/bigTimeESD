<%-- 
    Document   : loginView
    Created on : 21-Oct-2019, 14:58:11
    Author     : j3-lui
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>XYZ Claims System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <style>
            
        #textboxid
        {   
            text-align: center;
            height:20px;
            width:200px;
            font-family: Verdana;
            font-size:14pt;
            color: teal;
        }
            
        #textid
        {
            font-family: Verdana;
            font-size:14pt;
            color: white;
        }
        
        </style>
    
    </head>
    <body style="background-color: teal">
        <div><p style="color: white; font-family: Verdana; font-size: 20px; text-align: center">WELCOME TO XYZ ASSOCIATION LOG IN</p></div>
        <form method="post" action="AuthenticateUser.do"><p style="text-align:center">
            <br /><label id="textid">Name:</label><br />
            <input id="textboxid" type="text" name="name">
            <br /><label id="textid">Pass: </label><br />
            <input id="textboxid" type="password" name="pass"><br />
            <br><input type="SUBMIT" value="Log In" style="color: royalblue">
        </p></form>
    </body>
</html>
