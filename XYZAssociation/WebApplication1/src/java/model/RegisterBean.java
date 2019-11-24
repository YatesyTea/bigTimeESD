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
            DBBean db = new DBBean();
            
            // the mysql insert statement
            String query = " insert into users (ID, PASSWORD, STATUS)" + " values (?, ?, ?)";
            // create the mysql insert preparedstatement
            
            
            /*PreparedStatement preparedStmt = db.prepareStatement(query);
            preparedStmt.setString (1, ID);
            preparedStmt.setString (2, password1);
            preparedStmt.setString (3, "PENDING");*/
            
            
            return("A");
        }
        else {
            return("F");
        }
    }
}
