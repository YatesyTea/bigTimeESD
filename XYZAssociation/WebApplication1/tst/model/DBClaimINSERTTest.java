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
    DBClaimINSERT dbcIn;
    
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
        dbcIn = new DBClaimINSERT();
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
        DBClaimINSERT instance = dbcIn;
        
        String memID = "e-simons";
        String rationale = "broken life";
        double amount = 200.0;
        
        String expResult = "A";
        String result = instance.makeClaim(memID, rationale, amount);
        
        assertEquals(expResult, result);
    }
    
}
