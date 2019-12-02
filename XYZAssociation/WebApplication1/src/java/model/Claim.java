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
public class Claim {
    private int id;
    private String mem_id;
    private String date;
    private String rationale;
    private String status;
    private double amount;

    public Claim(int id, String mem_id, String date, String rationale, String status, double amount) {
        this.id = id;
        this.mem_id = mem_id;
        this.date = date;
        this.rationale = rationale;
        this.status = status;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMem_id() {
        return mem_id;
    }

    public void setMem_id(String mem_id) {
        this.mem_id = mem_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRationale() {
        return rationale;
    }

    public void setRationale(String rationale) {
        this.rationale = rationale;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String display() {
        return "id: " + this.id + "rationale: " + this.rationale;
    }
    

}
