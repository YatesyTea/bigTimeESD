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
public class DBClaimINSERTTest {
    
    public DBClaimINSERTTest() {
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
     * Test of makeClaim method, of class DBClaimINSERT.
     */
    @Test
    public void testMakeClaim() throws Exception {
        System.out.println("makeClaim");
        DBClaimINSERT instance = new DBClaimINSERT();
        
        String memID = "";
        String rationale = "";
        double amount = 0.0;
        
        String expResult = "";
        String result = instance.makeClaim(memID, rationale, amount);
        
        assertEquals(expResult, result);
    }
    
}
