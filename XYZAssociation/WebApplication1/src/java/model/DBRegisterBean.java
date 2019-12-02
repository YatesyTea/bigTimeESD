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
public class DBRegisterBean {

    public String createAccount(String name, String password1, String password2, String address, String dob) throws SQLException, ParseException {
        if (password1.equals(password2)) {
            DBConnectorBean dbib = new DBConnectorBean();

            String ID = name.toLowerCase().charAt(0) + "-" + name.toLowerCase().split(" ")[1];

            java.util.Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
            Date sqlDate = new Date(utilDate.getTime());

            // the mysql insert statement
            String query = " insert into users (ID, PASSWORD, STATUS)" + " values (?, ?, ?)";
            // create the mysql insert preparedstatement

            Connection con = dbib.openConnection();

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, ID);
            preparedStmt.setString(2, password1);
            preparedStmt.setString(3, "PENDING");
            preparedStmt.executeUpdate();

            query = " insert into members (ID, NAME, ADDRESS, DOB, DOR, STATUS, BALANCE)" + " values (?, ?, ?, ?, ?, ?, ?)";

            preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, ID);
            preparedStmt.setString(2, name);
            preparedStmt.setString(3, address);
            preparedStmt.setDate(4, sqlDate);

            LocalDate todayLocalDate = LocalDate.now(ZoneId.of("Europe/London"));
            
            preparedStmt.setDate(5, java.sql.Date.valueOf(todayLocalDate));
            preparedStmt.setString(6, "APPLIED");
            preparedStmt.setDouble(7, 0);
            preparedStmt.executeUpdate();

            dbib.closeConnection(con);

            return ("A");
        } else {
            return ("F");
        }
    }
}
