/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
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
public class DBPaymentRETURNTest {
    
    public DBPaymentRETURNTest() {
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
     * Test of getPayment method, of class DBPaymentRETURN.
     */
    @Test
    public void testGetPayment() {
        System.out.println("getPayment");
        DBPaymentRETURN instance = new DBPaymentRETURN();
        
        String mem_id = "e-simons";
        int expResult = 0;
        int result = instance.getPayment(mem_id).get(0).getId();
        
        assertEquals(expResult, result);
    }
    
}
