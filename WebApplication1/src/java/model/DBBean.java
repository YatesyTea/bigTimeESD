/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
/**
 *
 * @author j3-lui
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBBean {

    private Connection con;
    private Statement state;
    private ResultSet rs;

    public String doQuery(String query, String pass) {
        StringBuilder sb = new StringBuilder();

        try {
            // You will need to explicitly load this driver in a web app
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SampleDB", "j3", "j3");
            state = con.createStatement();
            //System.out.println(query + " " + pass);
            rs = state.executeQuery("SELECT * FROM USERS WHERE ID = '" + query + "' AND PASSWORD = '" + pass + "'");
            if (rs.next()) {
                sb.append(rs.getString(1) + " " + rs.getString(2));
                sb.append("\n<br>");
            }
            rs.close();
            state.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e);

        }//try
        if (!sb.toString().equalsIgnoreCase("")){
            return "true";
        }
        return "false";
    }
} //class
