<%-- 
    Document   : memberInfo
    Created on : 25-Nov-2019, 13:17:19
    Author     : joshp
--%>

<%@page import="model.Payment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Claim"%>
<%@page import="model.User"%>
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
          border: 1px solid white;
        }

        th, td {
          text-align: center;
          padding: 4px;
          color: white;
        }

        tr:nth-child{background-color: teal}
        
        </style>
        
    </head>
    <body style="background-color: teal">
        <h1 id="textid"> Claims and Payments </h1>

        <%
            ArrayList<Claim> claims = (ArrayList<Claim>)request.getAttribute("claims");
            ArrayList<Payment> payments = (ArrayList<Payment>)request.getAttribute("payments");
        %>
        
        
        <h1 id="textid">Claims</h1>
        
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
        
        <br><h1 id="textid">Payments</h1>
                
        <div style="overflow-x:auto;">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Member ID</th>
                    <th>Payment Type</th>
                    <th>Amount</th>
                    <th>Date</th>
                </tr>
                
                <% 
                    for (int i = 0; i < payments.size(); i++) {
                        out.println("<tr>");
                        out.println("<td>" + payments.get(i).getId() + "</td>");
                        out.println("<td>" + payments.get(i).getMem_id() + "</td>");
                        out.println("<td>" + payments.get(i).getType_of_payment() + "</td>");
                        out.println("<td>" + payments.get(i).getAmount() + "</td>");
                        out.println("<td>" + payments.get(i).getDate() + "</td>");
                        out.println("</tr>");
                    }
                %>
                
            </table>
        </div> 

    </body>
</html>
