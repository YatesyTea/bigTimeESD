/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author j3-lui
 */
public class AuthenticatorBean {

    private Connection con;
    private Statement state;
    private ResultSet rs;

    public String login(String name, String pass) {
        //StringBuilder sb = new StringBuilder();
        ArrayList<String> result = new ArrayList<String>();

        DBBean db = new DBBean();
        //sb.append(db.doQuery("SELECT * FROM USERS WHERE ID = '" + name+ "' AND PASSWORD = '"+pass+"'"));
        result = db.doQuery("SELECT * FROM USERS WHERE ID = '" + name + "' AND PASSWORD = '" + pass + "'");
        //if (!sb.toString().equalsIgnoreCase("")) {
        //    return sb.toString();
        //}
        if (!result.isEmpty()) {
            return result.get(2);
        }
        return "Failed";
    }
}
