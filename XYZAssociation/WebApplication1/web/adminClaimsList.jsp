<%-- 
    Document   : adminClaimsList
    Created on : 08-Dec-2019, 16:52:14
    Author     : joshp
--%>

<%@page import="model.Claim"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
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
            text-align: center;
            font-family: Verdana;
            font-size:14pt;
            color: white;
        }
        
        table {
            border-collapse: collapse;
            border-spacing: 0;
            width: 100%;
            columns: 1px;
            border: 1px solid white;
        }

        th, td {
            text-align: left;
            padding: 8px;
            color: white
        }

        tr:nth-child{background-color: teal}
        
        </style>
        
    <h1 style="text-align:center; position:fixed; top:5px; right:5px;"><a id="textid" href="/XYZAssociation/index.html">Log Out</a></h1>     
    </head>
    <body style="background-color: teal">
        <h1 id="textid">Admin Claims List</h1>
        
        <%
            ArrayList<Claim> claims = (ArrayList<Claim>)request.getAttribute("claims");
        %>
        
        <div style="overflow-x:auto;">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Member ID</th>
                    <th>Date</th>
                    <th>Rationale</th>
                    <th>Status</th>
                    <th>Amount</th>
                </tr>
                
                <% 
                    for (int i = 0; i < claims.size(); i++) {
                        out.println("<tr>");
                        out.println("<td>" + claims.get(i).getId() + "</td>");
                        out.println("<td>" + claims.get(i).getMem_id() + "</td>");
                        out.println("<td>" + claims.get(i).getDate() + "</td>");
                        out.println("<td>" + claims.get(i).getRationale() + "</td>");
                        out.println("<td>" + claims.get(i).getStatus() + "</td>");
                        out.println("<td>" + claims.get(i).getAmount() + "</td>");
                        out.println("</tr>");
                    }
                %>
                
            </table>
        </div> 
        
    </body>
</html>
