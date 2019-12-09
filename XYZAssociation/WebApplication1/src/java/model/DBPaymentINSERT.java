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

    public String makePayment(String memID, String typeOfPayment, double amount) throws SQLException, ParseException {
        DBConnectorBean dbib = new DBConnectorBean();

        LocalDate todayLocalDate = LocalDate.now(ZoneId.of("Europe/London"));

        String query = "insert into payments (mem_id, type_of_payment, amount, date)" + " values (?, ?, ?, ?)";
        
        Connection con = dbib.openConnection();

        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1, memID);
        preparedStmt.setString(2, typeOfPayment);
        preparedStmt.setDouble(3, amount);
        preparedStmt.setDate(4, java.sql.Date.valueOf(todayLocalDate));
        preparedStmt.executeUpdate();

        dbib.closeConnection(con);

        return ("A");
    }
}
