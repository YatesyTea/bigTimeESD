<%-- 
    Document   : registrationView
    Created on : 22-Nov-2019, 13:07:23
    Author     : joshp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        
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
        
        <form method="post" action="RegisterUser.do"><p style="text-align:center">
            <br /><label id="textid">Name:</label><br />
            <input id="textboxid" type="text" name="name">
            <br /><label id="textid">Password: </label><br />
            <input id="textboxid" type="password" name="pass1">
            <br /><label id="textid">Confirm Password: </label><br />
            <input id="textboxid" type="password" name="pass2"><br />
            <br><input type="SUBMIT" value="Sign Up" style="color: royalblue">
        </p></form>
    </body>
    
</html>
