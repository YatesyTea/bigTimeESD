<%-- 
    Document   : adminView
    Created on : 02-Dec-2019, 15:44:11
    Author     : joshp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Admin View</title>
        
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
        <h1 id="textid">Admin Page</h1>
        
        <form method="post" action="AdminMembersListController.do"><p style="text-align:center">
        <input id="textboxid" type="SUBMIT" value="Members List" style="align-self: center">
        </p></form>
        
        <form method="post" action="AdminOutstandingBalanceController.do"><p style="text-align:center">
        <input id="textboxid" type="SUBMIT" value="Outstanding Balances" style="align-self: center">
        </p></form>
        
        <form method="post" action="AdminClaimsListController.do"><p style="text-align:center">
        <input id="textboxid" type="SUBMIT" value="Claims List" style="align-self: center">
        </p></form>
        
        <form method="post" action="AdminProvisionalMembersController.do"><p style="text-align:center">
        <input id="textboxid" type="SUBMIT" value="Provisional Members" style="align-self: center">
        </p></form>
        
        <form method="post" action="AdminTurnoverReportsController.do"><p style="text-align:center">
        <input id="textboxid" type="SUBMIT" value="Turnover Reports" style="align-self: center">
        </p></form>
        
    </body>
</html>
