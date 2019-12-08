/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author joshp
 */
public class User {
    private String name = "";
    private String password = "";
    private String status = "";
    
    public User(String name, String password, String status) {
        this.name = name;
        this.password = password;
        this.status = status;
    }

    User() {
        this.status = "FAILED";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
