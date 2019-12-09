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
        int ID = 0;
        String memID = "";
        String typeOfPayment = "";
        int amount = 0;
        DBPaymentINSERT instance = new DBPaymentINSERT();
        String expResult = "";
        String result = instance.makePayment(ID, memID, typeOfPayment, amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
