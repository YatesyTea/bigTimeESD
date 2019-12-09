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
public class DBPaymentINSERT {

    public String makePayment(int ID, String memID, String typeOfPayment, int amount) throws SQLException, ParseException {
        DBConnectorBean dbib = new DBConnectorBean();

        LocalDate todayLocalDate = LocalDate.now(ZoneId.of("Europe/London"));

        String query = " insert into claims (mem_id, date, rationale, status, amount)" + " values (?, ?, ?, ?, ?)";
        
        Connection con = dbib.openConnection();

        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setInt(1, ID);
        preparedStmt.setString(2, memID);
        preparedStmt.setString(3, typeOfPayment);
        preparedStmt.setInt(4, amount);
        preparedStmt.setDate(5, java.sql.Date.valueOf(todayLocalDate));
        preparedStmt.executeUpdate();

        dbib.closeConnection(con);

        return ("A");
    }
}
