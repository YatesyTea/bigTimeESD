/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author joshp
 */
public class GetMemberClaimsBean {
    
    public ArrayList<Claim> getClaims(String name) {
        //StringBuilder sb = new StringBuilder();
        ArrayList<Claim> result = new ArrayList<Claim>();

        DBClaimsBean db = new DBClaimsBean();
        //sb.append(db.doQuery("SELECT * FROM USERS WHERE ID = '" + name+ "' AND PASSWORD = '"+pass+"'"));
        result = db.doQuery("SELECT * FROM CLAIMS WHERE MEM_ID = '" + name + "'");
        //if (!sb.toString().equalsIgnoreCase("")) {
        //    return sb.toString();
        //}
        
        return result;
    }
}
