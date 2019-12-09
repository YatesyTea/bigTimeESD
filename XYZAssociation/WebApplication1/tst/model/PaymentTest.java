/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yates
 */
public class PaymentTest {
    private Payment payment;
    
    public PaymentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("== Set Up");
        payment = new Payment(123, "Member_Id", "FEE", 200, "2019-27-10");
    }
    
    @After
    public void tearDown() {
        payment = null;
    }

    /**
     * Test of getId method, of class Payment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Payment instance = payment;
        
        int expResult = 123;
        int result = instance.getId();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Payment.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Payment instance = payment;
        
        int id = 0;
        instance.setId(id);
        
        int expResult = id;
        int result = instance.getId();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getMem_id method, of class Payment.
     */
    @Test
    public void testGetMem_id() {
        System.out.println("getMem_id");
        Payment instance = payment;
        
        String expResult = "Member_Id";
        String result = instance.getMem_id();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setMem_id method, of class Payment.
     */
    @Test
    public void testSetMem_id() {
        System.out.println("setMem_id");
        Payment instance = payment;
        
        String mem_id = "";
        instance.setMem_id(mem_id);
        
        String expResult = mem_id;
        String result = instance.getMem_id();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getType_of_payment method, of class Payment.
     */
    @Test
    public void testGetType_of_payment() {
        System.out.println("getType_of_payment");
        Payment instance = payment;
        
        String expResult = "FEE";
        String result = instance.getType_of_payment();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setType_of_payment method, of class Payment.
     */
    @Test
    public void testSetType_of_payment() {
        System.out.println("setType_of_payment");
        Payment instance = payment;
        
        String type_of_payment = "MONTHLY";      
        instance.setType_of_payment(type_of_payment);
        
        String expResult = type_of_payment;
        String result = instance.getType_of_payment();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getAmount method, of class Payment.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Payment instance = payment;
        
        int expResult = 200;
        int result = instance.getAmount();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setAmount method, of class Payment.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        Payment instance = payment;
        
        int amount = 150;    
        instance.setAmount(amount);
        
        int expResult = amount;
        int result = instance.getAmount();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getDate method, of class Payment.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Payment instance = payment;
        
        String expResult = "2019-27-10";
        String result = instance.getDate();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Payment.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Payment instance = payment;
        
        String date = "2019-01-01";
        instance.setDate(date);
        
        String expResult = date;
        String result = instance.getDate();
        assertEquals(expResult,result);
    }
    
}
