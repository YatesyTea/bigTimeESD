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
public class Payment {
    private int id;
    private String mem_id;
    private String type_of_payment;
    private int amount;
    private String date;

    public Payment(int id, String mem_id, String type_of_payment, int amount, String date) {
        this.id = id;
        this.mem_id = mem_id;
        this.type_of_payment = type_of_payment;
        this.amount = amount;
        this.date = date;
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

    public String getType_of_payment() {
        return type_of_payment;
    }

    public void setType_of_payment(String type_of_payment) {
        this.type_of_payment = type_of_payment;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
