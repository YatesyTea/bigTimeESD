/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 *
 * @author joshp
 */
public class DBClaimINSERT {

    public String makeClaim(String memID, String rationale, double amount) throws SQLException, ParseException {
        DBConnectorBean dbib = new DBConnectorBean();

        LocalDate todayLocalDate = LocalDate.now(ZoneId.of("Europe/London"));

        String query = " insert into claims (mem_id, date, rationale, status, amount)" + " values (?, ?, ?, ?, ?)";
        
        Connection con = dbib.openConnection();

        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1, memID);
        preparedStmt.setDate(2, java.sql.Date.valueOf(todayLocalDate));
        preparedStmt.setString(3, rationale);
        preparedStmt.setString(4, "APPLIED");
        preparedStmt.setDouble(5, amount);
        preparedStmt.executeUpdate();

        dbib.closeConnection(con);

        return ("A");
    }
}
