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
public class DBPaymentINSERTTest {
    
    public DBPaymentINSERTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of makePayment method, of class DBPaymentINSERT.
     */
    @Test
    public void testMakePayment() throws Exception {
        System.out.println("makePayment");
        DBPaymentINSERT instance = new DBPaymentINSERT();
        
        int ID = 25;
        String memID = "me-aydin";
        String typeOfPayment = "FEE";
        int amount = 200;
        
        
        String expResult = "A";
        String result = instance.makePayment(ID, memID, typeOfPayment, amount);
        assertEquals(expResult, result);
    }
    
}
