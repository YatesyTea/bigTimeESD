/*
 * Takes in the input from POST in index
 * Of username and password
 * Returns the status column in the database if the user and pass are valid
 * If not it returns failed.
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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBBean {

    private Connection con;
    private Statement state;
    private ResultSet rs;

    public ArrayList<String> doQuery(String query) {
        //StringBuilder sb = new StringBuilder();
        ArrayList<String> result = new ArrayList<String>();
        try {
            // You will need to explicitly load this driver in a web app
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/student", "pass", "pass");
            state = con.createStatement();
            rs = state.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            if (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    result.add(rs.getString(i));
                    //sb.append(rs.getString(i));
                    //sb.append("\n<br>");
                }
            }
            rs.close();
            state.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e);

        }//try
        //if (!sb.toString().equalsIgnoreCase("")) {
        //    return sb.toString();
        //}
        //return "DBBean Failed";
        
        return result;
    }
} //class
