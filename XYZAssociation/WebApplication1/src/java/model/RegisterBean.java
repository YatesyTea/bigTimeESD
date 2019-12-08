/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author joshp
 */
public class RegisterBean {
    
    public String createAccount(String ID, String password1, String password2) throws SQLException {
        if (password1.equals(password2)) {
            DBConnectorBean dbib = new DBConnectorBean();
            
            // the mysql insert statement
            String query = " insert into users (ID, PASSWORD, STATUS)" + " values (?, ?, ?)";
            // create the mysql insert preparedstatement
            
            Connection con = dbib.openConnection();
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, ID);
            preparedStmt.setString (2, password1);
            preparedStmt.setString (3, "PENDING");
            preparedStmt.executeUpdate();
            
            dbib.closeConnection(con);
            
            return("A");
        }
        else {
            return("F");
        }
    }
}
