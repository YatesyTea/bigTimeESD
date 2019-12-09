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
public class DBAllClaimRETURNTest {
    DBAllClaimRETURN dbaCR;
    
    public DBAllClaimRETURNTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dbaCR = new DBAllClaimRETURN();
    }
    
    @After
    public void tearDown() {
        dbaCR = null;
    }

    /**
     * Test of getClaims method, of class DBAllClaimRETURN.
     */
    @Test
    public void testGetClaims() {
        System.out.println("getClaims");
        DBAllClaimRETURN instance = dbaCR;
        
        String expResult = "change mirror";
        String result = instance.getClaims().get(0).getRationale();;
        
        assertEquals(expResult, result);
    }
    
}
