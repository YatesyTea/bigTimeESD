<%-- 
    Document   : outstandingBalance
    Created on : 08-Dec-2019, 16:51:42
    Author     : joshp
--%>

<%@page import="model.Member"%>
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
                border: 1px solid white;
            }

            th, td {
                text-align: left;
                padding: 8px;
                color: white;
            }

        </style>

    </head>
    <body style="background-color: teal">
        <h1 id="textid">Admin Outstanding Balances</h1>

        <%
            ArrayList<Member> member = (ArrayList<Member>) request.getAttribute("members");
        %>

        <div style="overflow-x:auto;">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Balance</th>
                </tr>

                <%
                    for (int i = 0; i < member.size(); i++) {
                        out.println("<tr>");
                        out.println("<td>" + member.get(i).getId() + "</td>");
                        out.println("<td>" + member.get(i).getName() + "</td>");
                        out.println("<td>" + member.get(i).getBalance() + "</td>");
                        out.println("</tr>");
                    }
                %>

            </table>
        </div> 
    </body>
</html>
