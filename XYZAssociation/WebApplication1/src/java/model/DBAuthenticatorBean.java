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
public class DBAuthenticatorBean {

    private Connection con;
    private Statement state;
    private ResultSet rs;

    public String login(String name, String pass) {
        ArrayList<User> result = new ArrayList<User>();

        DBGetUserBean db = new DBGetUserBean();
        result = db.doQuery("SELECT * FROM USERS WHERE ID = '" + name + "' AND PASSWORD = '" + pass + "'");
        if (!result.isEmpty()) {
            return result.get(0).getStatus();
        }
        return "Failed";
    }
}
