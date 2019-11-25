/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joshp
 */
public class DBInsertBean {
    private Connection con;
     
    public Connection openConnection() throws SQLException {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/student", "pass", "pass");
        return con;
     }
    
    public void closeConnection(Connection con) throws SQLException {
        con.close();
     }
}
