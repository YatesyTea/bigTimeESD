/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author joshp
 */
public class DBAppliedMemberUPDATE {
    
    public void updateAppliedMember(String name) throws SQLException, ParseException {
        DBConnectorBean dbib = new DBConnectorBean();
        String query = "UPDATE MEMBERS SET STATUS = ? WHERE ID" + " = ?";

        Connection con = dbib.openConnection();

        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1, "APPROVED");
        preparedStmt.setString(2, name);
    
        preparedStmt.executeUpdate();
        dbib.closeConnection(con);
    
    }
}
