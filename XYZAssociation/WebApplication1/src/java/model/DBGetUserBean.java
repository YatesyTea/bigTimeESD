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

public class DBGetUserBean {

    private Connection con;
    private Statement state;
    private ResultSet rs;

    public ArrayList<User> doQuery(String query) {
        ArrayList<User> result = new ArrayList<User>();
        DBConnectorBean dbib = new DBConnectorBean();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = dbib.openConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);
            
            if (rs.next()) {
                
                result.add(new User(rs.getString(1), rs.getString(2), rs.getString(3)));
                
            }
            rs.close();
            state.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e);

        }        
        return result;
    }
}
